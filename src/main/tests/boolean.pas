program booooolean;
var
a, b, c: boolean;
begin
a:=true;
b:=false;
c:=true;
if (a AND c) then
writeln('a and c are both true');
if(b AND c) then
writeln('you wont see this');
if(a OR b) then
writeln('a is true but b is not');
end.