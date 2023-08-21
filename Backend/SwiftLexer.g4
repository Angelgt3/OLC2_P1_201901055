lexer grammar SwiftLexer;

// --------------- Tokens
// types
INT:            'Int';
FLOAT:          'Float';
TSTRING:        'String';
BOOL:           'Bool';
CHAR:           'Character';


// reserved words
VAR:                    'var';
LET:                    'let';
TRU:                    'true';
FAL:                    'false';
PRINT:                  'print';
IF:                     'if';
ELSE:                   'else';
SWITCH:                 'switch';
CASE:                   'case';
DEFAULT:                'default';
BREAK:                  'break';
CONTINUE:               'continue';
RETURN:                 'return';
WHILE:                  'while';
FOR:                    'for';
IN:                     'in';
GUARD:                  'guard';
APPEND:                 'append';
REMOVELAST:             'removeLast';
REMOVE:                 'remove';
ISEMPTY:                'IsEmpty';
COUNT:                  'count';
REPEATING:              'repeating';
STRUCT:                 'struct';
SELF:                   'self';
MUTATING:               'mutating';
FUNC:                   'func';


// primitives
NUMBER : [0-9]+ ('.'[0-9]+)?;
STRING: '"'~["]*'"';
ID: ([a-zA-Z])[a-zA-Z0-9_]*;
CHARACTER: '"'~[']?'"';

// symbols
DIF:                '!=';
IG_IG:              '==';
NOT:                '!';
OR:                 '||';
AND:                '&&';
IG:                 '=';
MAY_IG:             '>=';
MEN_IG:             '<=';
MAYOR:              '>';
MENOR:              '<';
MOD:                '%';
MUL:                '*';
DIV:                '/';
ADD:                '+';
SUB:                '-';
PARIZQ:             '(';
PARDER:             ')';
LLAVEIZQ:           '{';
LLAVEDER:           '}';
CORIZQ:             '[';
CORDER:             ']';
DOSP:               ':';
COMA:               ',';
INTCE:              '?';
FLECHA:             '->';
AMP:                '&';

// skip
WHITESPACE:         [ \\\r\n\t]+ -> skip;
COMMENT :           '/*' .*? '*/' -> skip;
LINE_COMMENT :      '//' ~[\r\n]* -> skip;

