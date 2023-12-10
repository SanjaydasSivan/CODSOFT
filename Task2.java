import java.io.*;
import java.util.Scanner;
public class Task2
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    int[] mark = new int[5];
    int s = 0;
    System.out.println ("\n\t\tGRADE CALCULATOR");

    System.out.println ("\t Enter the marks\n");
    for (int i = 0; i < 5; i++)
    {
	    System.out.print (" Mark " + (i + 1) + " : ");
	    mark[i] = sc.nextInt ();
    }

    for (int i = 0; i < 5; i++)
    {
	    s += mark[i];
    }
    System.out.println ("\n Total : " + s);

    int average = s / 5;
    System.out.println ("\n Average : " + average + "%");

    if (average >= 90)
    {
	    System.out.println ("\n\t\t**GRADE : DISTINCTION**");
    }
    else if (90 < average && average >= 60)
    {
	    System.out.println ("\n\t\t**GRADE : FIRST CLASS**");
    }
    else if (60 < average && average >= 40)
    {
	    System.out.println ("\n\t\t**GRADE : SECOND CLASS**");
    }
    else
    {
	    System.out.println ("\n\t\t**GRADE : PASS**");
    }
  }
}
