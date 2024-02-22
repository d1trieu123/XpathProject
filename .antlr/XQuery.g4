grammar XQuery;

xq
    : var                                               #varXQ
    | strconst                                          #strXQ        
    | ap                                                #apXQ
    | '(' xq ')'                                        #parenXQ 
    | xq ',' xq                                         #commaXQ
    | xq '/' rp                                         #slashXQ
    | xq '//' rp                                        #doubleslashXQ 
    | '<' tagname '>' '{' xq '}' '</' tagname '>'       #tagXQ
    | forClause letClause? whereClause? returnClause    #flwrXQ
    | letClause xq                                      #letXQ      
    ;

ap
    : doc '/' rp                                        #childAP
    | doc '//' rp                                       #descendAP
    ;

doc
    : 'doc(' filename ')'                               #docName
    | 'document(' filename ')'                          #docName
    ;

filename
    : QTEXT ;

rp
    : tagname                                           #tagRP
    | '*'                                               #childrenRP
    | '.'                                               #selfRP
    | '..'                                              #parentRP
    | 'text()'                                          #textRP
    | '@' WORD                                          #attrRP
    | '(' rp')'                                         #parenRP
    | rp'/' rp                                          #childRP
    | rp'//' rp                                          #descendRP
    | rp'[' filter ']'                                  #filterPath
    | rp',' rp                                          #commaRP
    ;

filter
    : rp                                                #rpPF
    | filter AND filter                                 #apPF
    | filter OR filter                                  #orPF
    | NOT filter                                        #notPF
    | rp'=' rp                                          #equalsPF
    | rp' eq ' rp                                       #equalsPF
    | rp'==' rp                                         #samePF
    | rp' is ' rp                                       #samePF
    | rp'=' strconst                                    #stringPF
    | '(' filter ')'                                    #parenPF
    ;

forClause
    : 'for' var 'in' xq (',' var 'in' xq)* ;

letClause
    : 'let' var ':=' xq (',' var ':=' xq)* ;

whereClause
    : 'where' condition ;

condition
    : xq   '='  xq                  #equalsCond
    | xq ' eq ' xq                  #equalsCond
    | xq  '=='  xq                  #sameCond
    | xq ' is ' xq                  #sameCond
    | 'empty(' xq ')'               #emptyCond
    | someClause                    #someCond
    | '(' xq ')'                    #parenCond
    | xq AND xq                     #andCond
    | xq OR xq                      #orCond 
    | NOT xq                        #notCond
    ;

someClause
    : 'some' var 'in' xq (',' var 'in' xq)* 'satisfies' condition ;


returnClause
    : 'return' xq ;

tagname
    : WORD ;

strconst
    : QTEXT ;

var
    : '$' WORD ;

AND
    : ' and ';

OR
    : ' or ';

NOT
    : 'not ';

QTEXT
    : '"'~["]*'"' ;

WORD
    : [a-zA-Z][a-zA-Z_0-9]* ;

WS
    : [ \t\r\n] -> skip;