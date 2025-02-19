## Number Guessing Game 

Sample solution for the number-guessing-game challenge from  [roadmap.sh](https://roadmap.sh/projects/number-guessing-game).

## Authors
[William Okogwu](https://github.com/Williamokogwu)


## Overview
This is a simple Number Guessing Game implemented in Java. The game randomly selects a number between 1 and 100, and the player has a limited number of attempts to guess the correct number. The game provides three difficulty levels: Easy, Medium, and Hard, each with a different number of attempts.

## How to Play
1. Run the program.
2. Select a difficulty level:
   - Easy: 10 attempts
   - Medium: 5 attempts
   - Hard: 3 attempts
3. Enter your guesses, and the program will provide feedback on whether the number is higher or lower than your guess.
4. Continue guessing until you find the correct number or run out of attempts.

## Features
- Random number generation between 1 and 100.
- Three difficulty levels to choose from.
- Hints provided after each incorrect guess.
- Displays the number of attempts used if the player wins.
- Reveals the correct number if the player fails.

## Requirements
- Java Development Kit (JDK) installed

## How to Run
1. Compile the program using the following command:
   ```sh
   javac NumberGuess.java
   ```
2. Run the compiled program:
   ```sh
   java NumberGuess
   ```

## Code Structure
- `main` method: Initializes the game and prompts the user to select a difficulty level.
- `Easy()`, `Medium()`, `Hard()`: Set the difficulty level and initiate the guessing process.
- `method()`: Handles the guessing logic, including checking user input and providing hints.

## Potential Improvements
- Add a replay option after each game session.
- Implement a graphical user interface (GUI).
- Enhance user experience by adding sound effects or animations.

Enjoy playing the Number Guessing Game!

