# GuessNumberComputer
The computer guesses the number that is in your mind. The basic algorithm being used is Binary Search for narrowing down the upper bound and lower bounds. 

<h3>Prerequisite To Run the Program:</h3>
Java 1.7 or higher, Maven, Junit 4

<h3>Program Summary:</h3>
<b>Time Complexity of the Program:</b> O(log n)

<b>Assumption Made:</b>
The basic assumption that is considered is that the maximum value of that a user can chose is 100 and the minimum is -100

<b>Description:</b>
The Code is Developed in Java for simplicity, it can be developed in any language.
The basic algorithm used was Binary Search as it is the fasted approach that can be taken to narrow down the search/guess. The
guess range is halved each time a user gives a "higher" or "lower" input.

In the case that the user would have to increase the guess range
if the user wants the range to be maximum integer and minimum integer, binary search can have issues with overflow.
To Resolve Overflow Issue there are two solutions:

1) Increase the size of the data type to higher[long, BigInteger]

2) Decrease the value of the maximum and minimum to half so that it does not overflow

For further details regarding Binary Search Overflow Issue Please refer to the following link:

http://googleresearch.blogspot.com/2006/06/extra-extra-read-all-about-it-nearly.html

<b>Test Summary:</b>
An interactive test case of user input and output was not generated due to the complexity surrouding interactive 
JUNIT test cases. Even then the program is designed is such a manner that dependecy injection can be fulfilled with setter injection
and can be easily tested using Mock Objects.

<h3>Premise:</h3>
The objective of the program was fulfilled with the most optimized algorithm.

<h3>Initial Objective of the Program:</h3>

Write a program in Java to play a number-guessing game. The game works as follows:
The user chooses a number in his mind and types “ready” to indicate to the computer that he is ready to begin playing.
The computer asks a series of questions to arrive at the number the user has in mind. The user can only respond with “higher”, “lower” or “yes”.
The game ends when the user responds with “yes” or “end”.

<b>Example:</b>

User chooses number 40 in his mind. Computer: Is the number 30?

User: higher

Computer: Is the number 50?

User: lower

Computer: Is the number 35? User: higher

Computer: Is the number 40? User: yes
