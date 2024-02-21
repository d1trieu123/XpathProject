grammar Project;

// Parser rules

xq
    :  var                   #varXQ
    | ap                        #apXQ
    | '(' xq ')'                #parenXQ
    | xq ',' xq                #commaXQ
    | xq '/' rp                 #childXQ
    | xq '//' rp                #descendXQ
    | stringConstant            #stringXQ
    | startTag '{' xq '}' endTag  #tagXQ
    | forClause letClause? whereClause? returnClause  #forXQ
    | letClause xq               #letXQ
    ;

forClause
    : 'for ' var 'in' xq (', ' var 'in' xq)*
    ;

letClause
    : 'let ' var ':=' xq (', ' var ':=' xq)*
    ;

whereClause
    : 'where' cond
    ;

returnClause
    : 'return' rt
    ;

rt : xq                                                  #xqReturn
   | rt ',' rt                                           #commaReturn
   | startTag rt endTag                                  #tagReturn
   ;

cond
    : xq '=' xq                  #equalCond
    | xq 'eq' xq                 #equalCond
    | xq '==' xq                 #sameCond
    | xq 'is' xq                 #sameCond
    | 'empty(' xq ')'            #emptyCond
     | 'some ' var 'in' xq (', ' var 'in' xq)* 'satisfies' cond  #satisfyCond
    | '(' cond ')'               #parenCond
    | cond 'and' cond           #andCond
    | cond 'or' cond            #orCond
    | 'not' cond                #notCond
    ;

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

stringConstant
    : comparisonString
    ;

tagName
    : ID
    ;
attrName
    : ID
    ;

startTag
    : '<' tagName '>'
    ;
endTag
    : '</' tagName '>'
    ;

filename
    : FILENAME
    ;
var
    : '$' ID
    ;

comparisonString
    : '"' .*? '"'
    ;


// Lexer rules

WS : [ \t\r\n]+ -> skip;
DOC: 'doc("'; 
ENDOC: '")';
ID: [a-zA-Z0-9_-]+ ;
FILENAME: [a-zA-Z0-9._]+;
