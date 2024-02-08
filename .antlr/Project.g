grammar Project;

// Parser rules
ap
    : doc '/'  rp    # childAP
    | doc '//' rp    # descendAP
    ;

doc
    :  'doc("' filename '")'    # docName
    ;


rp
    : tagName                    #tagRP
    | '*'                        #childrenRP
    | '.'                        #selfRP
    | '..'                       #parentRP
    | 'text()'                   # textRP
    | '@' attrName               # attrRP
    | '(' rp ')'                 # parenRP
    | rp '/' rp                  # childRP
    | rp '//' rp                 # descendRP
    | rp '[' pf ']'              # filterPath
    | rp ',' rp                  # unionRP
 
    ;

pf
    : rp                         # rpPF
    | rp '=' rp                  #equalsPF
    | rp 'eq' rp                 #equalPF
    | rp '==' rp                 #samePF
    | rp 'is' rp                 #samePF
    | rp '=' comparisonString    #stringPF
    | '(' pf ')'                 #parenPF
    | pf 'and' pf                #andPF
    | pf 'or' pf                 #orPF
    | 'not' pf                   #notPF
    ;
tagName
    : ID
    ;
attrName
    : ID
    ;

filename
    : FILENAME
    ;


comparisonString
    : '"' .*? '"'
    ;


// Lexer rules
LETTER : 'a'..'z' | 'A'..'Z';
DIGIT : '0'..'9';
WS : [ \t\r\n]+ -> skip;
DOC: 'doc("'; 
ENDOC: '")';
ID: [a-zA-Z0-9_-]+ ;
FILENAME: [a-zA-Z0-9._]+;