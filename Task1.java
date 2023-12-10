import java.util.Scanner;
import java.util.Random;
class Task1
{
  public static void main (String[]args)
  {
    //instance for the class
    Task1 t=new Task1();

    //function call
      t.randomcomp ();
  }
  void randomcomp ()
  {
    //random number generation
    Random r = new Random ();
    int rnd = r.nextInt (100);

    //start of game
    System.out.println ("\n\t\tYOUR GAME IS STARTED");
    System.out.println ("\n\tFIND THE NUMBER..YOU HAVE ONLY 3 ATTEMPTS");
    int i = 1;

    //loop start
    while (i <= 3)
      {
	//print the number of attempts
	System.out.println ("\n  ATTEMEPT NUMBER : " + (i));
	Scanner s = new Scanner (System.in);

	//getting user input
	System.out.print ("\tGuess a number:");
	int inp = s.nextInt ();

	//comparison of generated and user values
	if (inp == rnd)
	{
	    System.out.println ("\n\t**GREAT ONE! YOU WON!!**");
	    break;
	}
	else if (inp < rnd)
	{
	    System.out.println ("\n\t**TRY A LARGE NUMBER**");
	}
	else
	{
	    System.out.println ("\n\t**TRY  A SMALL NUMBER**");
	}
	i++;

	//attempts exceed
	if (i == 4)
	{
	    System.out.println ("\n CLOSE ENOUGH..TRY AGAIN LATER");
	}

    }				//loop end

    //print score board
    if (i == 1)
    {
	    System.out.println ("\n\tSCORE = 100");
    }
    else if (i == 2)
    {
	    System.out.println ("\n\tSCORE = 50");
    }
    else if (i == 3)
    {
	    System.out.println ("\n\tSCORE = 20");
    }
    else
    {
	    System.out.println ("\n\tYOUR SCORE = 0");
    }
        System.out.println ("\n\n\t\t***GOOD TRY***");
  }
}