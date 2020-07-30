program numberadder;
var
a, b, c, numop, num: real;

begin
	writeln('Type three numbers followed by return at the end of each:');
	readln(a,b,c);
	writeln('Operations: ');
	writeln('1. Plus');
	writeln('2. Subtract');
	writeln('3. Multiply');
	writeln('4. Divide');
	writeln('Enter number of operation');
	readln(numop);
	writeln('Enter number to do operation with: ');
	readln(num);
	if(numop = 1) then
		writeln(a+num, ' ', b+num, ' ', c+num);
	if(numop = 2) then
		writeln(a-num, ' ', b-num, ' ', c-num);
	if(numop = 3.0) then
		writeln(a*num, ' ', b*num, ' ', c*num);
	if(numop = 4) then
		writeln(a/num, ' ', b/num, ' ', c/num);
end.