## README FOR Pascal Interpreter Implemented in Java

This project utilizes ANTLR to generate a parse tree visited by a Java Base Visitor.
Pascal instructions are interpreted in Java and output to the command line.
Implemented features are listed below as well as features that are still being worked on.

To build code, run the following command:
```
mvn -q clean install
```
To run code, run the following command:
```
mvn -q exec:java -Dexec.args="src/main/tests/[name of test file]"
```

## Features:
- program name
- variable and constant declarations
- comments
- basic arithmatic with variables
- boolean/logical expressions
- precedence of operators
- if-then-else, case
- read and write
- special math expressions
- while do and for do loops
- break and continue

## Features not working:
- Scoping
- Procedures and functions 

## Available file names:
- casestatements.pas
- arithmetic.pas
- helloworld.pas
- numberadder.pas
- boolean.pas
- ultimatetest.pas
- constanttest.pas
- varconstmix.pas
- whilecontinue.pas
- whilebreak.pas
- forloop.pas

## Required input:
- casestatements.pas: 1 real number between 1 and 5
- helloworld.pas: no input required
- arithmetic.pas: no input required
- numberadder.pas: 3 real numbers with newlines after each, 1 real number between 1 and 4, and 1 real number
- boolean.pas: no input required
- ultimatetest.pas: 1 real number between 1 and 12
- constanttest.pas: 1 real number
- varconstmix.pas: no input required
- whilecontinue.pas: no input required
- whilebreak.pas: no input required
- forloop.pas: no input required

## Known outputs:
- helloworld.pas: hello one two three
- arithmetic.pas: 1.0 1.0 1.0 6.0
- boolean.pas: 'a and c are both true', 'a is true but b is not'
- ultimatetest.pas: 'a is 1.0. b is -20.0. c is 5.0. d is true. e is false. f is false', 'a and c/5 equal 1', 'f or not not d', [other outputs]
- varconstmix.pas: 'This statement should output if calculations are correct'
- whilecontinue.pas: 2.0
                 4.0
                 8.0
                 16.0
                 32.0
                 64.0
                 128.0
                 256.0
                 1024.0
                 2048.0
- whilebreak.pas: 2.0
                  4.0
                  8.0
                  16.0
                  32.0
                  64.0
                  128.0
                  256.0
                  512.0
- forloop.pas: 1.0
               3.0
               6.0
               10.0
               15.0
               21.0

### Credit
This project made in conjunction with: Mustafa Mohamed
