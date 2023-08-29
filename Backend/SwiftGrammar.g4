grammar SwiftGrammar; 
// import SwiftLexer; 

options {
  tokenVocab = SwiftLexer;
}

@header {
    import "Backend/interfaces"
    import "Backend/environment"
    import "Backend/expressions"
    import "Backend/instructions"
    import "strings"
}


s returns [[]interface{} code]
: block EOF
    {   
        $code = $block.blk
    }
;
//bloque de isntrucciones
block returns [[]interface{} blk]
@init{
    $blk = []interface{}{}
    var listInt []IInstructionContext
  }
: ins+=instruction+
    {
        listInt = localctx.(*BlockContext).GetIns()
        for _, e := range listInt {
            $blk = append($blk, e.GetInst())
        }
    }
;
//instrucciones
instruction returns [interfaces.Instruction inst]
: printstmt                                                 { $inst = $printstmt.prnt}
| variablestmt                                              { $inst = $variablestmt.vari}
| ifstmt                                                    { $inst = $ifstmt.ifinst }
| switchstmt                                                { $inst = $switchstmt.swinst }
| whilestmt                                                 { $inst = $whilestmt.whileinst }
| funvecstmt                                                { $inst = $funvecstmt.fvecisnt }
;
//PRINT
printstmt returns [interfaces.Instruction prnt]
: PRINT PARIZQ expr PARDER                                  { $prnt = instructions.NewPrint($PRINT.line,$PRINT.pos,$expr.e)}
;
//DECLARACIONES
variablestmt returns [interfaces.Instruction vari]
//variables
: VAR ID DOSP typestmt IG expr                                  { $vari = instructions.NewDeclaration($VAR.line, $VAR.pos, $ID.text, $typestmt.type, $expr.e, true) }
| VAR ID IG expr                                                { $vari = instructions.NewDeclaration($VAR.line, $VAR.pos, $ID.text, environment.NULL, $expr.e, true) }
| VAR ID DOSP typestmt INTCE                                    { $vari = instructions.NewDeclaration($VAR.line, $VAR.pos, $ID.text, $typestmt.type, expressions.NewPrimitive($ID.line, $ID.pos, nil, environment.NULL), true) }
//inmutables
| LET ID IG primitives                                          { $vari = instructions.NewDeclaration($LET.line, $LET.pos, $ID.text, environment.NULL, $primitives.p, false) }
| LET ID DOSP typestmt IG primitives                            { $vari = instructions.NewDeclaration($LET.line, $LET.pos, $ID.text, $typestmt.type, $primitives.p, false) }
//asignacion
| ID IG expr                                                    { $vari = instructions.NewAssigment($ID.line, $ID.pos, $ID.text, $expr.e) }
| ID CORIZQ e1=expr CORDER IG e2=expr                           { $vari = instructions.NewAssigmentVec($ID.line, $ID.pos, $ID.text, $e1.e, $e2.e) }
//vectores
| VAR ID DOSP typestmt IG expr                                  { $vari = instructions.NewDeclaration($VAR.line, $VAR.pos, $ID.text, $typestmt.type, $expr.e, true) }
| VAR ID DOSP typestmt IG CORIZQ CORDER                         
{
    $vari = instructions.NewDeclaration($VAR.line, $VAR.pos, $ID.text, $typestmt.type, 
    expressions.NewArray($CORIZQ.line, $CORIZQ.pos, nil),
    true)
}
;
//TIPOS
typestmt returns [environment.TipoExpresion type]
: INT                       { $type = environment.INTEGER }
| FLOAT                     { $type = environment.FLOAT }
| TSTRING                   { $type = environment.STRING }
| BOOL                      { $type = environment.BOOLEAN }
| CHAR                      { $type = environment.CHAR }
| CORIZQ type2stmt CORDER   { $type = $type2stmt.type2 }
;

type2stmt returns [environment.TipoExpresion type2]
: INT                       { $type2 = environment.A_INTEGER }
| FLOAT                     { $type2 = environment.A_FLOAT }
| TSTRING                   { $type2 = environment.A_STRING }
| BOOL                      { $type2 = environment.A_BOOLEAN }
| CHAR                      { $type2 = environment.A_CHAR }
| CORIZQ type2stmt CORDER   { $type2 = $type2stmt.type2 }
;

//Funciones vector
funvecstmt returns [interfaces.Instruction fvecisnt]
: ID PUNTO APPEND PARIZQ expr PARDER            { $fvecisnt = instructions.NewAppend($ID.line, $ID.pos, $ID.text , $expr.e) }
| ID PUNTO REMOVELAST PARIZQ PARDER             { $fvecisnt = instructions.NewRemoveLast($ID.line, $ID.pos, $ID.text) }
| ID PUNTO REMOVE PARIZQ AT DOSP expr PARDER    { $fvecisnt = instructions.NewRemove($ID.line, $ID.pos, $ID.text , $expr.e) }
;

//IF
ifstmt returns [interfaces.Instruction ifinst]
: IF expr LLAVEIZQ block LLAVEDER                                                   { $ifinst = instructions.NewIf($IF.line, $IF.pos, $expr.e, $block.blk, nil,nil) }
| IF expr LLAVEIZQ bif=block LLAVEDER ELSE LLAVEIZQ belse=block LLAVEDER            { $ifinst = instructions.NewIf($IF.line, $IF.pos, $expr.e, $bif.blk, $belse.blk,nil) }
| IF expr LLAVEIZQ bif=block LLAVEDER elifs                                         { $ifinst = instructions.NewIf($IF.line, $IF.pos, $expr.e, $block.blk, nil, $elifs.elifinst) }
| IF expr LLAVEIZQ bif=block LLAVEDER elifs ELSE LLAVEIZQ belse=block LLAVEDER      { $ifinst = instructions.NewIf($IF.line, $IF.pos, $expr.e, $block.blk, $belse.blk, $elifs.elifinst) }
;
//ELSE IF
elifs returns [[]interface{} elifinst]
:celif=elifs ELSE IF expr LLAVEIZQ block LLAVEDER 
{
    var arrif []interface{}
    arrif = append($celif.elifinst, instructions.NewElif($ELSE.line, $ELSE.pos, $expr.e, $block.blk))
    $elifinst = arrif
}   
| ELSE IF expr LLAVEIZQ block LLAVEDER
{
    $elifinst = []interface{}{}
    $elifinst = append($elifinst, instructions.NewElif($ELSE.line, $ELSE.pos, $expr.e, $block.blk))
    
}
;
//SWITCH
switchstmt returns [interfaces.Instruction swinst]
: SWITCH expr LLAVEIZQ cases DEFAULT DOSP block LLAVEDER        { $swinst = instructions.NewSwitch($SWITCH.line, $SWITCH.pos, $expr.e, $cases.casesinst, $block.blk) }
| SWITCH expr LLAVEIZQ cases LLAVEDER                           { $swinst = instructions.NewSwitch($SWITCH.line, $SWITCH.pos, $expr.e, $cases.casesinst, nil) }
;
//CASES
cases returns [[]interface{} casesinst]
:ccases=cases CASE expr DOSP block
{
    var arrcase []interface{}
    arrcase = append($ccases.casesinst, instructions.NewCase($CASE.line, $CASE.pos, $expr.e, $block.blk))
    $casesinst = arrcase
}   
|CASE expr DOSP block
{
    $casesinst = []interface{}{}
    $casesinst = append($casesinst, instructions.NewCase($CASE.line, $CASE.pos, $expr.e, $block.blk))
    
}
;
//WHILE
whilestmt returns [interfaces.Instruction whileinst]
: WHILE expr LLAVEIZQ block LLAVEDER                        { $whileinst = instructions.NewWhile($WHILE.line, $WHILE.pos, $expr.e, $block.blk) }
;
//EXPRESIONES
expr returns [interfaces.Expression e]
: left=expr op=(MUL|DIV|MOD) right=expr                     { $e = expressions.NewOperationBinary($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(ADD|SUB) right=expr                         { $e = expressions.NewOperationBinary($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MAY_IG|MAYOR) right=expr                    { $e = expressions.NewOperationBinary($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MEN_IG|MENOR) right=expr                    { $e = expressions.NewOperationBinary($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(IG_IG|DIF) right=expr                       { $e = expressions.NewOperationBinary($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=AND right=expr                               { $e = expressions.NewOperationBinary($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=OR right=expr                                { $e = expressions.NewOperationBinary($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| op=NOT left=expr                                          { $e = expressions.NewOperationUnary($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text) }
| op=SUB left=expr                                          { $e = expressions.NewOperationUnary($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text) }
| PARIZQ expr PARDER                                        { $e = $expr.e }
| primitives                                                { $e = $primitives.p}
//cosas de array
| listArray                                                 { $e = $listArray.p}
| CORIZQ listParams CORDER                                  { $e = expressions.NewArray($CORIZQ.line, $CORIZQ.pos, $listParams.l) }
| ID PUNTO COUNT                                            { $e = expressions.NewCount($ID.line, $ID.pos, $ID.text) }
| ID PUNTO ISEMPTY                                          { $e = expressions.NewIsEmpty($ID.line, $ID.pos, $ID.text) }
;

//EXPRESIONES PRIMITIVAS
primitives returns [interfaces.Expression p]
: NUMBER                             
    {
        if (strings.Contains($NUMBER.text,".")){
            num,err := strconv.ParseFloat($NUMBER.text, 64);
            if err!= nil{
                fmt.Println(err)
            }
            $p = expressions.NewPrimitive($NUMBER.line,$NUMBER.pos,num,environment.FLOAT)
        }else{
            num,err := strconv.Atoi($NUMBER.text)
            if err!= nil{
                fmt.Println(err)
            }
            $p = expressions.NewPrimitive($NUMBER.line,$NUMBER.pos,num,environment.INTEGER)
        }
    }
| CHARACTER
    {
        str := $CHARACTER.text
        $p = expressions.NewPrimitive($CHARACTER.line, $CHARACTER.pos, str[1:len(str)-1],environment.CHAR)
    }
| STRING
    {
        str := $STRING.text
        $p = expressions.NewPrimitive($STRING.line, $STRING.pos, str[1:len(str)-1],environment.STRING)
    }
| ID
    {
        $p = expressions.NewCallVariable($ID.line, $ID.pos, $ID.text)
    }                        
| TRU                                                       { $p = expressions.NewPrimitive($TRU.line, $TRU.pos, true, environment.BOOLEAN) }
| FAL                                                       { $p = expressions.NewPrimitive($FAL.line, $FAL.pos, false, environment.BOOLEAN) }
;

//  LISTA DE PARAMETROS
listParams returns[[]interface{} l]
: list=listParams COMA expr 
{
    var arr []interface{}
    arr = append($list.l, $expr.e)
    $l = arr
}   
| expr 
{
    $l = []interface{}{}
    $l = append($l, $expr.e)
}
;

//ACCEDER ARRAY
listArray returns[interfaces.Expression p]
: list = listArray CORIZQ expr CORDER { $p = expressions.NewArrayAccess($list.start.GetLine(), $list.start.GetColumn(), $list.p, $expr.e) }
| ID { $p = expressions.NewCallVariable($ID.line, $ID.pos, $ID.text)}
;