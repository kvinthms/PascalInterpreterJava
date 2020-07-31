program whilecontinue;
var
  counter, max: real;
begin
  (*This program outputs hello world to console and antlr ignores this comment*)
  counter:=2;
  max:= 4096;
  while counter < max do
  begin

    writeln(counter);
    if counter = 256 then
      begin
      counter:=1024;
      continue;
      end;
    counter:=counter*2;

  end;
end.