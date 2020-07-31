program casestatements;

var
  number: real;

begin
  writeln('Enter year number, between 1 and 5, negative number to finish:');
  readln(number);
  if (number >= 1) and (number <= 5) then begin
    case number of
      1: writeln('First year student');
      2: writeln('Sophomore');
      3: writeln('Junior');
      4: writeln('Senior');
      5: begin
        writeln('Congratulations, you have graduated ... ');
        writeln('Graduate student?');
      end
    end
  end
end.