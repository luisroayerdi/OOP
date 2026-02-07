import java.util.Arrays;
import java.util.Scanner;
/**
 * This is the class for Question 2: Sorted Names [6 points]
 */
public class Q2
{
    /*
    This is the main method where we will take the three different names for input and sort them in ascending (alphabetical) order.
    */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        //Variable for name1
        String name1 = in.nextLine();

        System.out.print("Enter the second name: ");
        //Variable for name2
        String name2 = in.nextLine();

        System.out.print("Enter the third name: ");
        //Variable for name3
        String name3 = in.nextLine();

        //Variable to store the different names on an array
        String arr[] = {name1,name2,name3};

        //Sorts arr[] in ascending order
        Arrays.sort(arr);

        System.out.println("Names Sorted in Ascending Order:");
        System.out.println("1. " + arr[0]);
        System.out.println("2. " + arr[1]);
        System.out.println("3. " + arr[2]);
    }
}