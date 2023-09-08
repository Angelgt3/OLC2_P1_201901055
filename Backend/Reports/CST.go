package reports

import (
	"bytes"
	"encoding/json"
	"fmt"
	"io/ioutil"
	"log"
	"net/http"
	"os"
	"strings"
)

type ResponseData struct {
	Result ResponseData2 `json:"result"`
}
type ResponseData2 struct {
	Svgtree string `json:"svgtree"`
}

func Crear_CST(code string) {
	url := "http://lab.antlr.org/parse/"

	// Datos que deseas enviar en la solicitud POST
	code = strings.ReplaceAll(code, "\r\n", "\\n")
	code = strings.ReplaceAll(code, `"`, `\"`)
	var contenido = `{"grammar":"grammar SwiftGrammar; \r\n\r\noptions {\r\n  tokenVocab = SwiftLexer;\r\n}\r\n\r\nprogram\r\n: block EOF\r\n;\r\n\r\nblock \r\n: ins+=instruction+\r\n;\r\n\r\ninstruction \r\n: printstmt PCOMA? \r\n| variablestmt PCOMA? \r\n| guardstmt           \r\n| ifstmt              \r\n| switchstmt          \r\n| whilestmt           \r\n| forstmt             \r\n| funvecstmt         \r\n| BREAK PCOMA?       \r\n| CONTINUE PCOMA?    \r\n| RETURN expr PCOMA? \r\n| funcallstmt        \r\n| funcstmt                                       \r\n| structCreation                                 \r\n;\r\n\r\n\r\nstructCreation\r\n: STRUCT ID LLAVEIZQ listStructDec LLAVEDER \r\n;\r\n\r\nlistStructDec \r\n: listStructDec COMA VAR ID DOSP typestmt\r\n| VAR ID DOSP typestmt \r\n|  \r\n;\r\n\r\nfuncstmt \r\n: FUNC ID  PARIZQ PARDER LLAVEIZQ block LLAVEDER                                  \r\n| FUNC ID PARIZQ listParamsFunc PARDER LLAVEIZQ block LLAVEDER                    \r\n| FUNC ID  PARIZQ PARDER FLECHA typestmt LLAVEIZQ block LLAVEDER                  \r\n| FUNC ID PARIZQ listParamsFunc PARDER FLECHA typestmt LLAVEIZQ block LLAVEDER    \r\n;\r\n\r\nlistParamsFunc \r\n: listParamsFunc COMA (ID|GBAJO)? ID DOSP INOUT? typestmt \r\n| (ID|GBAJO)? ID DOSP INOUT? typestmt \r\n|  \r\n;\r\n\r\nfuncallstmt \r\n: ID PARIZQ PARDER  \r\n| ID PARIZQ listParams PARDER     \r\n;\r\n\r\nfuncallestmt \r\n: ID PARIZQ PARDER   \r\n| ID PARIZQ listParams PARDER  \r\n;\r\n\r\nprintstmt \r\n: PRINT PARIZQ expr PARDER      \r\n| PRINT PARIZQ listParams PARDER \r\n;\r\n\r\nvariablestmt \r\n: VAR ID DOSP typestmt IG expr  \r\n| VAR ID IG expr                \r\n| VAR ID DOSP typestmt INTCE    \r\n| LET ID IG primitives    \r\n| LET ID DOSP typestmt IG primitives\r\n| LET ID IG expr                    \r\n| LET ID DOSP typestmt IG expr      \r\n| LET ID IG expr                    \r\n| ID IG expr \r\n| ID CORIZQ e1=expr CORDER IG e2=expr  \r\n| ID e1=expr IG e2=expr                \r\n| ID ADD IG expr     \r\n| ID SUB IG expr     \r\n| VAR ID DOSP typestmt IG expr   \r\n| VAR ID DOSP typestmt IG CORIZQ CORDER \r\n| VAR ID IG expr  \r\n;\r\n\r\ntypestmt \r\n: INT    \r\n| FLOAT  \r\n| TSTRING\r\n| BOOL   \r\n| CHAR   \r\n| CORIZQ type2stmt CORDER\r\n;\r\n\r\ntype2stmt \r\n: INT     \r\n| FLOAT   \r\n| TSTRING \r\n| BOOL    \r\n| CHAR    \r\n| CORIZQ type2stmt CORDER  \r\n;\r\n\r\nfunvecstmt \r\n: ID PUNTO APPEND PARIZQ expr PARDER           \r\n| ID PUNTO REMOVELAST PARIZQ PARDER            \r\n| ID PUNTO REMOVE PARIZQ AT DOSP expr PARDER   \r\n;\r\n\r\nguardstmt \r\n:GUARD expr ELSE LLAVEIZQ block LLAVEDER    \r\n;\r\n\r\nifstmt \r\n: IF expr LLAVEIZQ block LLAVEDER        \r\n| IF expr LLAVEIZQ block LLAVEDER ELSE LLAVEIZQ block LLAVEDER \r\n| IF expr LLAVEIZQ block LLAVEDER elifs                              \r\n| IF expr LLAVEIZQ block LLAVEDER elifs ELSE LLAVEIZQ block LLAVEDER\r\n;\r\n\r\nelifs \r\n:elifs ELSE IF expr LLAVEIZQ block LLAVEDER \r\n| ELSE IF expr LLAVEIZQ block LLAVEDER\r\n;\r\n\r\nswitchstmt \r\n: SWITCH expr LLAVEIZQ cases DEFAULT DOSP block LLAVEDER  \r\n| SWITCH expr LLAVEIZQ cases LLAVEDER                     \r\n;\r\n\r\ncases \r\n:cases CASE expr DOSP block\r\n|CASE expr DOSP block\r\n;\r\n\r\nwhilestmt \r\n: WHILE expr LLAVEIZQ block LLAVEDER  \r\n;\r\n\r\nforstmt \r\n: FOR ID IN expr TRESP expr LLAVEIZQ block LLAVEDER   \r\n| FOR ID IN expr LLAVEIZQ block LLAVEDER                    \r\n;\r\n\r\n\r\nexpr \r\n:expr (MUL|DIV|MOD) expr      \r\n|expr (ADD|SUB) expr          \r\n|expr (MAY_IG|MAYOR) expr     \r\n|expr (MEN_IG|MENOR) expr     \r\n|expr (IG_IG|DIF) expr        \r\n|expr AND expr                \r\n|expr OR expr                 \r\n| NOT expr                           \r\n| SUB expr                           \r\n| PARIZQ expr PARDER                         \r\n| ID                                         \r\n| primitives                                 \r\n| INT PARIZQ expr PARDER           \r\n| FLOAT PARIZQ expr PARDER         \r\n| TSTRING PARIZQ expr PARDER       \r\n| listArray                           \r\n| CORIZQ listParams CORDER            \r\n| ID PUNTO COUNT                      \r\n| ID PUNTO ISEMPTY                    \r\n| listAceso                           \r\n| ID PARIZQ listStructExp PARDER      \r\n| funcallestmt                        \r\n;\r\n\r\n\r\nprimitives \r\n: NUMBER                             \r\n| CHARACTER\r\n| STRING\r\n| TRU                                                      \r\n| FAL                                                      \r\n| NIL                                                      \r\n;\r\n\r\nlistParams\r\n:listParams COMA expr \r\n| expr \r\n;\r\n\r\nlistArray \r\n:listArray CORIZQ expr CORDER\r\n| ID \r\n| listArray PUNTO ID\r\n;\r\n\r\nlistAceso \r\n:listAceso CORIZQ expr CORDER\r\n| CORIZQ expr CORDER\r\n;\r\n\r\nlistStructExp\r\n:listStructExp COMA ID DOSP expr \r\n| ID DOSP expr\r\n|   \r\n;","lexgrammar":"lexer grammar SwiftLexer;\r\n\r\n// --------------- Tokens\r\n// types\r\nINT:            'Int';\r\nFLOAT:          'Float';\r\nTSTRING:        'String';\r\nBOOL:           'Bool';\r\nCHAR:           'Character';\r\n\r\n\r\n// reserved words\r\nVAR:                    'var';\r\nLET:                    'let';\r\nTRU:                    'true';\r\nFAL:                    'false';\r\nPRINT:                  'print';\r\nIF:                     'if';\r\nELSE:                   'else';\r\nSWITCH:                 'switch';\r\nCASE:                   'case';\r\nDEFAULT:                'default';\r\nBREAK:                  'break';\r\nCONTINUE:               'continue';\r\nRETURN:                 'return';\r\nWHILE:                  'while';\r\nFOR:                    'for';\r\nIN:                     'in';\r\nGUARD:                  'guard';\r\nAPPEND:                 'append';\r\nREMOVELAST:             'removeLast';\r\nREMOVE:                 'remove';\r\nISEMPTY:                'isEmpty';\r\nCOUNT:                  'count';\r\nREPEATING:              'repeating';\r\nSTRUCT:                 'struct';\r\nSELF:                   'self';\r\nMUTATING:               'mutating';\r\nFUNC:                   'func';\r\nAT:                     'at';\r\nINOUT:                  'inout';\r\nNIL:                    'nil';\r\n\r\n// primitives\r\nNUMBER : [0-9]+ ('.'[0-9]+)?;\r\nCHARACTER: '\"'~[']?'\"';\r\nSTRING: '\"'~[\"]*'\"';\r\nID: ([a-zA-Z])[a-zA-Z0-9_]*;\r\n\r\n// symbols\r\nDIF:                '!=';\r\nIG_IG:              '==';\r\nNOT:                '!';\r\nOR:                 '||';\r\nAND:                '&&';\r\nIG:                 '=';\r\nMAY_IG:             '>=';\r\nMEN_IG:             '<=';\r\nMAYOR:              '>';\r\nMENOR:              '<';\r\nMOD:                '%';\r\nMUL:                '*';\r\nDIV:                '/';\r\nADD:                '+';\r\nSUB:                '-';\r\nPARIZQ:             '(';\r\nPARDER:             ')';\r\nLLAVEIZQ:           '{';\r\nLLAVEDER:           '}';\r\nCORIZQ:             '[';\r\nCORDER:             ']';\r\nDOSP:               ':';\r\nPUNTO:              '.';\r\nCOMA:               ',';\r\nINTCE:              '?';\r\nFLECHA:             '->';\r\nAMP:                '&';\r\nPCOMA:              ';';\r\nGBAJO:              '_';\r\nTRESP:              '...';\r\n\r\n// skip\r\nWHITESPACE:         [ \\\\\\r\\n\\t]+ -> skip;\r\nCOMMENT :           '/*' .*? '*/' -> skip;\r\nLINE_COMMENT :      '//' ~[\\r\\n]* -> skip;\r\n\r\n",`
	contenido += `"input":"` + code + `"`
	contenido += `,"start":"program"}`
	postData := []byte(contenido)
	requestBody := bytes.NewBuffer(postData)

	// Realizar la solicitud POST
	resp, err := http.Post(url, "application/json", requestBody)
	if err != nil {
		fmt.Println("Error al realizar la solicitud:", err)
		return
	}
	defer resp.Body.Close()

	// Verificar el código de estado de la respuesta HTTP
	if resp.StatusCode == http.StatusOK {
		// Decodificar la respuesta JSON en una estructura de datos
		respuesta, err := ioutil.ReadAll(resp.Body)
		if err != nil {
			log.Fatal(err)
		}

		var responseData ResponseData
		err = json.Unmarshal([]byte(respuesta), &responseData)
		if err != nil {
			fmt.Println("Error al deserializar el JSON:", err)
			return
		}

		// Creo el archivo xml
		archivoXML, err := os.Create("./Reportes_Creados/Reporte_cst.xml")
		if err != nil {
			panic(err)
		}
		defer archivoXML.Close()
		// Escribir los datos en el archivo
		datosXML := []byte(responseData.Result.Svgtree)
		archivoXML.Write(datosXML)

	} else {
		fmt.Println("Error en la respuesta. Código de estado:", resp.StatusCode)
	}

}
