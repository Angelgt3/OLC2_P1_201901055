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

instruction returns [interfaces.Instruction inst]
: printstmt                                                 { $inst = $printstmt.prnt}
| variablestmt                                              { $inst = $variablestmt.vari}
| ifstmt {}
;

printstmt returns [interfaces.Instruction prnt]
: PRINT PARIZQ expr PARDER                                  { $prnt = instructions.NewPrint($PRINT.line,$PRINT.pos,$expr.e)}
;

variablestmt returns [interfaces.Instruction vari]
: VAR ID DOSP typestmt IG expr                              { $vari = instructions.NewDeclaration($VAR.line, $VAR.pos, $ID.text, $typestmt.type, $expr.e, true) }
| VAR ID IG expr                                            { $vari = instructions.NewDeclaration($VAR.line, $VAR.pos, $ID.text, environment.NULL, $expr.e, true) }
| VAR ID DOSP typestmt INTCE                                { $vari = instructions.NewDeclaration($VAR.line, $VAR.pos, $ID.text, $typestmt.type, expressions.NewPrimitive($ID.line, $ID.pos, nil, environment.NULL), true) }
| ID IG expr                                                { $vari = instructions.NewAssigment($ID.line, $ID.pos, $ID.text, $expr.e) }
| LET ID IG primitives                                            { $vari = instructions.NewDeclaration($LET.line, $LET.pos, $ID.text, environment.NULL, $primitives.p, false) }
| LET ID DOSP typestmt IG primitives                              { $vari = instructions.NewDeclaration($LET.line, $LET.pos, $ID.text, $typestmt.type, $primitives.p, false) }
;

typestmt returns [environment.TipoExpresion type]
: INT       { $type = environment.INTEGER }
| FLOAT     { $type = environment.FLOAT }
| TSTRING   { $type = environment.STRING }
| BOOL      { $type = environment.BOOLEAN }
| CHAR      { $type = environment.CHAR }
;

ifstmt  
: IF PARIZQ expr PARDER LLAVEIZQ block LLAVEDER
;

expr returns [interfaces.Expression e]
: left=expr op=(MUL|DIV|MOD) right=expr                     { $e = expressions.NewOperationBinary($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(ADD|SUB) right=expr                         { $e = expressions.NewOperationBinary($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MAY_IG|MAYOR) right=expr                    { $e = expressions.NewOperationBinary($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MEN_IG|MENOR) right=expr                    { $e = expressions.NewOperationBinary($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(IG_IG|DIF) right=expr                       { $e = expressions.NewOperationBinary($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=AND right=expr                               { $e = expressions.NewOperationBinary($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=OR right=expr                                { $e = expressions.NewOperationBinary($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| op=NOT left=expr                                          { $e = expressions.NewOperationUnary($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text) }
| PARIZQ expr PARDER                                        { $e = $expr.e }
| primitives                                                { $e = $primitives.p}
;


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
