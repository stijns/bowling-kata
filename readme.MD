# Bowling TDD Kata

## Bowling score rules

A game consists of 10 frames .  In each frame the player has​
two opportunities to knock down 10 pins.  The score for the frame is the total​
number of pins knocked down, plus bonuses for strikes and spares.​
​

A spare is when the player knocks down all 10 pins in two tries.  The bonus for​
that frame is the number of pins knocked down by the next roll.  So in frame 3​
above, the score is 10 (the total number knocked down) plus a bonus of 5 (the​
number of pins knocked down on the next roll.)​
​

A strike is when the player knocks down all 10 pins on his first try.  The bonus​
for that frame is the value of the next two balls rolled.​
​

In the tenth frame a player who rolls a spare or strike is allowed to roll the extra​
balls to complete the frame.  However no more than three balls can be rolled in​
tenth frame.

## TDD approach

1) Write a unit test, the test fails
1) Write code to pass the unit test
1) Repeat step 1 and 2 until your program is ready

- Start with the simplest unit test
- On every iteration you add a more complex test
- Step 2 is always a good moment to reflect on your design, refactor if needed (refactoring is safe, you have unit tests :-) ) 
