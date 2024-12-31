package Part_1_Easy;

import java.util.Scanner;

public class Program3_digit_counter {
    
    public static void main(String[] args) {
        
        // Input a number and count the total number of digits in it.
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter the number : ");
        int number = sc.nextInt();

        int count = 0;
        while (number > 0) {
            number = number/10;
            count++;
        }
        System.out.println("The number of digits are : " + count);
        System.out.println("\n--------\n");
        sc.close();
    }
}
