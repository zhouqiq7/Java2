package Tutorial.M1.NoSeven;

import java.util.Scanner;

public class SquareDemo {

    /* Write a short java method  takes an integer n and returns the sum of the squares of all positive integers */

        public static void main (String []args){

            int total=0;

            Scanner input = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            int n=input.nextInt();

            for (int j=1; j<=n; j++)
                total=total + j*j;

            System.out.println("The total is "+total);
        }
}
