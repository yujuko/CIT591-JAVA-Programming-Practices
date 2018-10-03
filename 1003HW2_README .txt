
README for CIT591 HW2 - Part 2
-------------------------------------------
-------------------------------------------
Author: Lucy Kuo
Date: 18/10/02
IDE: Eclipse
Version: Photon Release (4.8.0)
-------------------------------------------
-------------------------------------------
Problem 1 : Quadratic Equation
Purpose: Write a program that prints all real solutions to the quadratic equation ax^2 + bx + c = 0.

Design:
Firstly, we create a class Quadratic Equation to receive and store the coefficients a, b, c of the quadratic equation. 
And we also supply a method to evaluate the value of the quadratic equation given a specific x. Also provide getters for a, b, c. Secondly, we create a class QuadraticEquationSolver whose constructor receives an object of type QuadraticEquation. 
In the class, we Supply methods getDiscriminant, getSolution1 and getSolution2 that get the solutions.
The getDiscriminant method help us to evaluate how many solutions does the equation have. So we can print out the answer properly . Additionally, there is a mutator method for QuadraticEquation in case someone need to use it.
Finally, we implement a QuadraticEquationTester class to test the program. After the user type in a,b,c coefficients, The main method should read user input for a, b, c, construct the appropriate objects, and print the solutions out properly.

Executes:
Firstly, the tester program prints out a message "Enter coefficients a, b, and c in order: " and scan the coefficients that users type in by importing java.util.Scanner. Then we store the number in three integer variables a, b, c. Then we construct QuadraticEquationSolver with argument QuadraticEquation. And call the getSolution1,2 method, print them out.
Example:
A.
   Enter coefficients a, b, and c in order: 
   1
   5
   2
   The roots of the equation are -4.561552812808831 and -0.4384471871911697
B.
   Enter coefficients a, b, and c in order: 
   1
   2
   1
   The roots of the equation are equal : -1.0

----------------------------------------------------------------------------------
Problem 2: Factoring of integers
Purpose: Create a program that asks the user for an integer and then prints out all its factors.

Design:
Firstly, we create a class FactorGenerator whose constructor receives an argument integer that being factored. In the class, we design two methods: nextFactor and hasMoreFactors. Method NextFactor prints out the next factor from the number being factored. hasMoreFactors checks if the number has more factors and return true/ false.

Execute:
We make a class FactorPrinter and reads a user input, constructs a FactorGenerator object, and prints the factors by calling nextFactor and hasMoreFactors in FactorGenerator.

Example:
A.
    Type an integer: 70
    1 2 5 7 10 14 35 70 
B.
    Type an integer: 290
    1 2 5 10 29 58 145 290 
 
-------------------------------------------------------------------------------
Problem 3: The Buffon Needle Experiment
Purpose: A class that models the Buffon Needle Experiment that, when a needle of length 1 inch is dropped onto paper that is ruled with lines 2 inches apart. There is a tries/hits approximates p.

Design:
Firstly, we use a for loop which Simulates throwing a needle for 10000 times, each time with a random lower point and a random angle. The Math.random() function returns a floating-point, pseudo-random number in the range 0–1 (inclusive of 0, but not 1) with approximately uniform distribution over that range. For the lower point of y, we need a random number between 0.0-2.0. For the angle, we need a random number between 0.0-180.0.
Then the higher point is calculated by adding up lower point and the angle. If it's larger than 2, it's a hit. Therefore, we declare a variable hitCount to record the number of hits.
The result of tries/hits is approximately hitCount/10000.

Execute:
A.
    Tries/hits approximates = 0.1635
B.
    Tries/hits approximates = 0.1589
C.
    Tries/hits approximates = 0.1668
