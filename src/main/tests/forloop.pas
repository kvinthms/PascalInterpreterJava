program forloop;
var
  sum, count: real;
begin
  sum := 0;
  for count := 1 to 100 do
  begin
    sum := sum + count;
    writeln(sum);
    if sum > 20 then break;
  end;
end.