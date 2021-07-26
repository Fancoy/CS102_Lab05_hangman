package cs102.ConsoleHangman.src;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * ConsoleHangman
 *
 * @author
 * @version 1.00 2013/4/7
 */

public class ConsoleHangman
{
    public static void main( String[] args) throws FileNotFoundException {
    	Scanner scan = new Scanner( System.in);

    	System.out.println( "Start of ConsoleHangman\n");

		// VARIABLES
		Hangman hangman;

		// PROGRAM CODE
		hangman = new Hangman( new BasicSetup() );
		HangmanModel hM = new HangmanModel(new BasicSetup());
		hM.addView(new ConsoleHangmanView());

		hM.tryThis('a');
		hM.tryThis('b');
		hM.tryThis('c');

		System.out.println( hangman.getKnownSoFar() );




		System.out.println( "\nEnd of ConsoleHangman\n" );
	}

} // end of class ConsoleHangman
