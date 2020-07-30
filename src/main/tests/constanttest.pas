program constanttest;
const
PI = 3.14159265359;
var
radius, area, circumference: REAL;
begin
	writeln('Circle calculations');
	writeln('Enter radius of circle: ');
	readln(radius);
	(*PI:=1;*) (*Running this line of code will cause interpreter to fail because PI is const*)
	writeln('Formula for area: PI * radius^2');
	writeln('Formula for circumference: 2 * PI * radius');
	writeln('The area of the circle is ', (radius*radius)*PI);
	writeln('The circumference of the circle is ', PI*(2*radius));
end.