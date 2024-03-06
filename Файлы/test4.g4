grammar test4;
programm: code;
code:(instruction)*;
instruction: (comand);
comand: add|sub | mov| xchg;
add: (ADD operand1 ',' operand2);
mov: (MOV operand1 ',' operand2);
sub: (SUB operand1 ',' operand2);
xchg: (XCHG operand1 ',' operand2);
operand1: (ID); 
operand2: (INT|ID);
//вводим определение ригистров


	
INT:
		(DIGIT)+ ('d' | 'D')?
        |(DIGIT)+ ('h' | 'H')
        |(DIGIT)+ ('o' | 'O' | 'Q'|'q')
        | (DIGIT)+ ('b' | 'B')	
		;
ADD: 'add' ;
MOV: 'mov';
SUB: 'sub';
XCHG: 'xchg';
// Индификатор начинается с буквы (латинской), 
// может состоять из букв, цифр и символов из набора @ _ $ ? \\
register: REGISTER;
REGISTER:  'regiter';
ID: LETTER (LETTER|DIGIT)*;
fragment LETTER : [a-zA-Z_?$@]; 
fragment DIGIT: [0-9];
WS : [ \t\r\n]+ -> skip ;	
	