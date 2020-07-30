Mustafa Mohamed
Kevin Thomas
## README FOR COP4020 - PROJECT 1

To build code, run the following command:
```
mvn clean install
```
To run code, run the following command:
```
mvn -q exec:java -Dexec.args="src/main/tests/[name of test file]"
```

## Bonus Attempted:
- Constants

## Available file names:
- casestatements.pas
- arithmetic.pas
- helloworld.pas
- numberadder.pas
- boolean.pas
- ultimatetest.pas
- constanttest.pas (Bonus Test File for constants)
- varconstmix.pas (Bonus Test File for constants)


## Required input:
- casestatements.pas: 1 real number between 1 and 5
- helloworld.pas: no input required
- arithmetic.pas: no input required
- numberadder.pas: 3 real numbers with newlines after each, 1 real number between 1 and 4, and 1 real number
- boolean.pas: no input required
- ultimatetest.pas: 1 real number between 1 and 12
- constanttest.pas: 1 real number
- varconstmix.pas: no input required

## Known outputs:
- helloworld.pas: 'hello world two three'
- arithmetic.pas: 1.0 1.0 1.0 6.0
- boolean.pas: 'a and c are both true', 'you wont see this'
- ultimatetest.pas: 'a is 1.0. b is -20.0. c is 5.0. d is true. e is false. f is false', 'a and c/5 equal 1', 'f or not not d', [other outputs]
- varconstmix.pas: 'This statement should output if calculations are correct'