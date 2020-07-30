program ultimatetest;
var
	a, b, c, number: real;
	d, e, f: boolean;
begin
	a:=sqrt(cos(2000-2000)); (*should be 1*)
	b:=sin((3*3.141592658)/2)*20; (*should be -20*)
	c:=(ln(exp(1))*10)/2; (*should be 5*)
	d:=true;
	e:=false;
	f:=false;
	
	writeln('a is ', a,'. b is ', b, '. c is ', c, '. d is ', d, '. e is ', e, '. f is ', f);
	
	if(a = (c/5)) then
	writeln('a and c/5 equal 1');
	
	if(f OR NOT NOT d) then
	writeln('f or not not d');
	
	writeln('Enter month number to see month name:');
     readln(number);
     if (number >= 1) and (number <= 12) then begin
      case number of
        1: begin
             writeln('January');
             writeln('Happy New Years!!');
            end;
        2: begin
             writeln('February');
             writeln('Happy Valentines Day!!');
            end;
        3: begin
             writeln('March');
             writeln('SPRING BREAK MY DUDES!!');
            end;
        4: begin
             writeln('April');
             writeln('Happy April Fools Day!!');
            end;
        5: begin
             writeln('May');
             writeln('Cinco de Mayo!!');
            end;
        6: begin
             writeln('June');
             writeln('Happy First Day of Summer!!');
            end;
        7: begin
             writeln('July');
             writeln('Happy Independence Day!!');
            end;
        8: begin
             writeln('August');
             writeln('Birth month of Kevin!!');
            end;
        9: begin
             writeln('September');
             writeln('Happy Labor Day!!');
            end;
        10: begin
             writeln('October');
             writeln('Happy Halloween!!');
            end;
        11: begin
             writeln('November');
             writeln('Happy Thanksgiving!!');
            end;
        12: begin
             writeln('December');
             writeln('Marry Christmas!!');
            end
      end
    end
	
end.