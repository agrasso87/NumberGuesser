/**
 * @(#)GuessingProgram.java
 *
 *
 * @Alex Grasso
 * @version 1.00 2018/10/6
 */

import java.util.Scanner;

public class GuessingProgram {

    public static void main(String[] args) {

    	char guess = 'l';
    	char playAgain = 'y';
    	NumberGuesser game = new NumberGuesser(1, 100);

		do{
    		System.out.println("Number Guesser");
    		System.out.println("Pick a number between 1 and 100");
    		guess = getUserInput(game);

			while (guess != 'c' && game.getCurrentGuess() != 1){
				if (guess == 'h'){
					game.higher();
					guess = getUserInput(game);
					game.getCurrentGuess();
				}
				else{
					game.lower();
					guess = getUserInput(game);
					game.getCurrentGuess();
				}
			}

			if (game.getCurrentGuess() == 1)
				System.out.println("Number cannot be zero!");
			else
				System.out.println("Your number is " + game.getCurrentGuess());

			game.reset();
			playAgain = playGameAgain();
		} while(playAgain != 'n');
    }

    public static char getUserInput(NumberGuesser game){
    	Scanner input = new Scanner(System.in);
    	System.out.println("Is your number " + game.getCurrentGuess() + " ?");
    	System.out.println("h = higher | l = lower | c = correct");
    	return input.next().toLowerCase().charAt(0);
    }

    public static char playGameAgain(){
    	Scanner input = new Scanner(System.in);
    	System.out.println("Would you like to play again?");
    	return input.next().toLowerCase().charAt(0);
    }
}
