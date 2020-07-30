program varconstmix;
var v1: REAL;
const c1 = 5;
var v2: boolean;
const c2 = 10;
begin
	v1:=c1*c2;
	if v1 = 50 then
	v2 := true
	else
	v2 := false;
	
	if v2 then
	writeln('This statement should output if calculations are correct')
	else
	writeln('Something is wrong :()');
	
end.