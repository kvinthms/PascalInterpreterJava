program whilebreak;
var
  counter, max: real;
begin
  (*This program outputs hello world to console and antlr ignores this comment*)
  counter:=2;
  max:= 4096;
  while counter < max do
  begin

    writeln(counter);
    if counter = 512 then break;
    counter:=counter*2;

  end;
end.