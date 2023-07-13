
///              No guessing Game

package Atminter;

import java.util.Scanner;
public class num_guess
{
    public static void guessingNumber()
    {
        Scanner sc = new Scanner(System.in);
        int num = 1 + (int)(100 * Math.random());
        int K = 0;
        int guess;
        while(K<10)
        {
            System.out.println("Guess the number please:");
            guess = sc.nextInt();
            if (num == guess)
            {
                System.out.println("Congratulations");
                K += 1;
                System.out.println("you got it " + K + " trials.");
                System.out.println("Your score is " + ((10 - K) * 10) + ".");
                break;
            }
            else if (num > guess)
            {
                System.out.println("The number is greater than " + guess);
                K += 1;
            }
            else
            {
                System.out.println("The number is less than " + guess);
                K += 1;
            }
        }
        System.out.println("complete!");
    }
    public static void main(String[] arg)
    {
        System.out.println("This is a number guessing game " );
        System.out.println("you guess from 1 to 100 and you have  10 trials.");
        System.out.println("How many round do you want to play? ");
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        int a = 0;
        while(round != a)
        {
            System.out.println("Round" + (a + 1) + ":");
            guessingNumber();
            a += 1;
            System.out.println("Thank you");
            System.out.println();
        }
    }
}
