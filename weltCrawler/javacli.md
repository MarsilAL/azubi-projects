Java CLI App
============

Get familiar with java and gradle and stuff

Task 1
------

Create a java application using gradle. It is ok to copy stuff from the java challenge testing repo. 

__Your app should print out a random number when ever I call it.__

For example: 

  ```bash
  $ java -jar /path/to/your/jar 
  $ 234234
  $ java -jar /path/to/your/jar 
  $ 123
  ```
  
Task 2
------

Extend your app to read arguments specifying how many letters the random number should have. 

- If the user enters an invalid number (less than 1 and bigger than 10) you should infrom the user how to use the app.

```bash
  $ java -jar /path/to/your/jar 
  $ please specify the amount of letter (min: 0, max: 10)
  $
  $ java -jar /path/to/your/jar 5
  $ 30301
  $  
  $ java -jar /path/to/your/jar 2
  $ 28
  $
  $ java -jar /path/to/your/jar 11
  $ please specify the amount of letter (min: 0, max: 10)
  ```
- Draw an activity diagram that shows how your application is working. From start to end. You can use plantuml for that or excalidraw. Don't know what an activity diagram is? checkout https://www.youtube.com/watch?v=XFTAIj2N2Lc



Task 3
-------

Time to talk about the software building process and how to run your app.

- You are using gradle to build your software. Explain what happens when gradle "build" is executed?  
- Do you know what a jar is? Tell us! What files are inside? What is so cool about the concept of a jar?
- Build your software as a jar and demonstrate the functionality as outlined in Task 2.


Task 4
------

Extract your random number logic to a service class called "RandomNumberService" with a function "int random(int nLetters)" that takes the number of letters as an argument.

- Write unit tests asserting that two consequent calls do not produce the same result
- Write a unit test that asserts that the number of letters is correct
- 
