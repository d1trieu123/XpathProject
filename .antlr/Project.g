grammar Project;


// Parser rules

xpath
    : absolutePath EOF
    | relativePath EOF
    ;

absolutePath
    : DOC fileName ENDOC childNode  relativePath
    | DOC fileName ENDOC descendOrSelf relativePath
    ;

relativePath
    : tagName
    | all
    | self
    | parent
    | text
    | ATSIGN attributeName
    | OPENPAREN relativePath CLOSEPAREN
    | relativePath childNode relativePath
    | relativePath descendOrSelf relativePath
    | relativePath OPENBRACKET pathFilter CLOSEBRACKET
    | relativePath CLOSEPAREN relativePath
 
    ;

pathFilter
    : relativePath
    | relativePath equals relativePath
    | relativePath twoEquals relativePath
    | relativePath is relativePath
    | relativePath equals (comparisonString | comparisonNumber)
    | OPENPAREN pathFilter CLOSEPAREN
    | pathFilter and pathFilter
    | pathFilter or pathFilter
    | not pathFilter
    ;
tagName
    : TAG_NAME
    ;

fileName
    : FILENAME
    ;

is 
    : IS
    ;
and
    : AND
    ;
or 
    : OR
    ;
not 
    : NOT
    ;

comparisonString
    : QUOTE .*? QUOTE
    ;

comparisonNumber
    : DIGIT
    ;

attributeName
    : TAG_NAME
    ;

axisSpecifier
    : AXES
    ;
descendOrSelf
    : TWO_SLASH
    ;
childNode
    : SLASH
    ;
equals 
    : EQU
    ;
twoEquals
    : TWO_EQU
    ;
all
    : STAR
    ;
self
    : PERIOD
    ;
parent
    : TWO_PERIOD
    ;
text
    : TEXT
    ;

// Lexer rules
LETTER : 'a'..'z' | 'A'..'Z';
DIGIT : '0'..'9';
WS : [ \t\r\n]+ -> skip;

DOC: 'doc("'; 
ENDOC: '")';
SLASH: ('/');
TWO_SLASH: ('//');
EQU : '=';
TWO_EQU : '==';
EQ : 'eq';
IS : 'is';
AND : 'and';
OR : 'or';
NOT : 'not';
QUOTE : '"';
TEXT : 'text()';
OPENPAREN : '(';
CLOSEPAREN : ')';
COMMA : ',';
OPENBRACKET : '[';
CLOSEBRACKET : ']';
STAR : '*';
PERIOD : '.';
TWO_PERIOD : '..';
TAG_NAME        : LETTER (LETTER | DIGIT)*;


FILENAME        : LETTER (LETTER | DIGIT | '.' | '_')*;
ATSIGN          : '@';

AXES            
    : 'child' 
    | 'descendant' 
    | 'parent' 
    | 'ancestor' 
    | 'following' 
    | 'preceding' 
    | 'following-sibling' 
    | 'preceding-sibling'
    | 'attribute'
    | 'descendant-or-self'
    | 'ancestor-or-self'
    | 'self'
    ;