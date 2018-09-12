
README for CIT591 HW1 - Part 2
-------------------------------------------
-------------------------------------------
Author: Lucy Kuo
Date: 18/09/12
IDE: Eclipse
Version: Photon Release (4.8.0)
-------------------------------------------
-------------------------------------------
A. Problem 1
Purpose: Counting the date of Easter Sunday when users type in a year.

Design:
Firstly, the program prints out a message "Enter a year: " and scan the year that users type in by importing java.util.Scanner. Then we store the number in an integer variable y. After that, it takes 13 steps' calculations, which also creates 13 integers, to get our result- month and day of Easter Sunday. 

Since it's 2018 now and the Easter Sunday in this year has passed (4/1), I separated the answer with 2018. By doing so, the answers would show up with correct verb tenses.Example:
1. Enter a year: 2018
   In 2018, Easter Sunday fell on 4/1!

2. Enter a year: 2004
   In 2004, Easter Sunday fell on 4/11!

3. Enter a year: 2030
   In 2030, Easter Sunday falls on 4/21!

----------------------------------------------------------------------------------
B. Problem 2
Purpose: Create a name and modify it into a password that fits the requirements.

Design:
In part a, I constructed a StringBuilder with my name- Lucy and printed it out.
In part b, I used the methods- delete, append, insert and replace in StringBuilder to modify my name into a different word- Lululemon.
In part c, I appended some information to the word to make it longer. Also inserted a symbol to make it readable.
In part d, I decided to keep the first three letters and deleted the rest of them. And then appended the word to itself. The word is now a palindrome.

Execute:
 My name is Lucy.
 I got a new name: LuluLemon!
 I got a new password: LuluLemon- FoundedInVancouver,CanadaIn1998!
 LulLul is a palindrome now ! 

-------------------------------------------------------------------------------
B. Problem 3
Purpose: studentAndScore is a class that can record a student's name, scores and generate the student's average score.

Design:
Firstly, I declare a String to store a student's name, an integer studentScore to store and add up student's total score, and an integer numberOfQuizzes to count the number of quizzes that the student took.

There are two constructors: 
When there is only one quiz, we can construct the class with a student's name and the score. But if the student has taken more than one quiz, we can construct with the student's name, the total score and the numbers of quizzes so far.

There are four methods in the class:
addQuiz​(int score): Add a score to the student's record.- return void
getAverageScore(): Get the student's average score.- return double
getName(): Get the student's name - return String
getTotalScore(): Get the student's total score.- return int

Test:
To test the studentAndScore, I created a new class called studentTester.
And constructed the class with my name and one score.
After that, three scores are added through addQuiz() method. 
Then the student's name, total score as well as average is printed out by calling getName(), getTotalScore() and getAverageScore().

In the second test, I constructed with a student and three scores.
And added two scores after that, also printed out the result by calling the three methods.

Execute:
Lucy's total score is 382 and the average is 95.5.
Jay's total score is 387 and the average is 77.4.
