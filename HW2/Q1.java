import java.util.Scanner;

/**
 * 
 * This is the class for Question 1: Roman Numerals [6 points]
 */
public class Q1
{
    /*
    This is the main method where we will be taking input from the user and transforming a decimal to roman numeral.
    */

    public static void main(String[] args)
    {

        // boolean to keep exit the while loop when the user has typed a valid input
        boolean flag = false;

        //creating scanner object to get user input
        Scanner in = new Scanner(System.in);

        //variable to represent the number selected by the user
        int number = 1;

        while (!flag)
        {
            System.out.print("Enter a number from 1 to 90 inclusive: ");

            //declaring number
            number = in.nextInt();
            if (number < 1 || number > 90) 
            {
                System.out.println("Invalid Input try again.");
            }
            else 
            {
                flag = true;
            }
        }

        //Variable to safe the decimal representation of number
        int Dnumber = number;

        //Decimal bases
        Integer[] base = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        //Array for roman numeral symbols
        String[] Rnumerals = {"I","IV", "V", "IX", "X", "XL", "L", "XC"};

        //to store result
        StringBuilder res = new StringBuilder();

        // the largest smaller base value
        int i = base.length - 1;
        while (number > 0) 
        {
            // variable to perform the division of the algorithm
            int div = number / base[i];
            while (div > 0) {
                res.append(Rnumerals[i]);
                div--;
            }
            
            // Repeat the process for remainder
            number = number % base[i];
            i--;
        }
        System.out.println("Roman numeral of " + Dnumber + ": " + res.toString());
    }
}
