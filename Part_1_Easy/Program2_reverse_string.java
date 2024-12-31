package Part_1_Easy;

import java.util.Scanner;

public class Program2_reverse_string {
    
    public static void main(String[] args) {
        
        // Take a string as input and print its reverse using a loop.
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the String you want : ");
        String examp = sc.nextLine();

        int i = examp.length() - 1;
        while (i >= 0) {
            System.out.print(examp.charAt(i));
            i--;
        }
        sc.close();
    }
}
