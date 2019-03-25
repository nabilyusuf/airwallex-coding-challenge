# Airwallex-Coding-Challenge
Solution to the  Airwallex code challenge

## Table of contents:

* [Description](./README.md#description)
  * [Constraints](./README.md#constraints)
  * [Example Input and Output](./README.md#example-input-and-output)
  * [Deliverables](./README.md#deliverables)
* [Setup](./README.md#setup)
* [Running the app](./README.md#running-the-app)
* [Running the tests](./README.md#running-the-tests)

## Description

* Code for simulating of a 'RPN' reverse polish notation calculater mode.
    * A stack that contains real number
    * The Calculator waits for user input and expects to receive strings containing whitespace separated lists of numbers and operators
    * Numbers Pushed on to the stack 
    * Operators operate on numbers that are on the stack.
    * Available operators are +, -, *, /, sqrt, undo, clear.
    * Operators pop their parameters off the stack, and push their results back onto the stack.
    * The ‘undo’ operator undoes the previous operation. “undo undo” will undo the previous two operations.
    * sqrt performs a square root on the top item from the stack.
    * The ‘+’, ‘-’, ‘*’, ‘/’ operators perform addition, subtraction, multiplication and division respectively on the top two items from the stack.
    * After processing an input string, the calculator displays the current contents of the stack as a space-separated list.
    * Numbers should be stored on the stack to at least 15 decimal places of precision, but displayed to 10 decimal places.
    * All numbers should be formatted as plain decimal strings.
    * If an operator cannot find a sufficient number of parameters on the stack, a warning is displayed:

##Constraints

* After processing an input string, the calculator displays the current contents of the stack as a space-separated list.
* Numbers should be stored on the stack to at least 15 decimal places of precision, but displayed to 10 decimal places.
* All numbers should be formatted as plain decimal strings.
* If an operator cannot find a sufficient number of parameters on the stack, a warning is displayed:
		```operator <operator> (position: <pos>): insufficient parameters```
* After displaying the warning, all further processing of the string terminates and the current state of the stack is displayed

### Example Input and Output:

	####Example 1
		15 2
		stack: 5 2

	####Example 2
		2 sqrt
		stack: 1.4142135623
		clear 9 sqrt
		stack: 3

	####Example 3
		5 2 -
		stack: 3
		3 -
		stack: 0
		clear
		stack:

	####Example 4
		5 4 3 2
		stack: 5 4 3 2
		undo undo *
		stack: 20
		5 *
		stack: 100
		undo
		stack: 20 5

	####Example 5
		7 12 2 /
		stack: 7 6
		*
		stack: 42
		4 /
		stack: 10.5

	####Example 6
		1 2 3 4 5
		stack: 1 2 3 4 5
		*
		stack: 1 2 3 20
		clear 3 4 -
		stack: - 1

	####Example 7
		1 2 3 4 5
		stack: 1 2 3 4 5
		* * * *
		stack: 120

	####Example 8
		1 2 3 * 5 + * * 6 5
		operator * (position: 15): insucient parameters
		stack: 11(the 6 and 5 were not pushed on to the 
		stackdue to the previous error)




### Deliverables

Source code, and any test code/data used in developing the solution.

## Setup

1. Make sure you have JRE 8 installed on your machine. If you need help installing , take a look at the [installation guide](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html).

2. Clone this repo:

    ```git clone git@github.com:nabilyusuf/airwallex-coding-challenge.git```

3. Change to the src directory:

    ```cd airwallex-coding-challenge```

4. Compile:

    ```mvn compile```

4. Test:

    ```mvn test```        

And you're ready to go!

### Running the app:
    mvn spring-boot:run    
    
###### On Docker
     docker build --rm --force-rm -t coding/excersice .
     
     docker run -it coding/excersice /bin/ash
