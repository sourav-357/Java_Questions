package Part_2_Normal;

import java.util.Scanner;

public class Program5_wordsCounter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease enter any sentance : ");
        String str = scanner.nextLine();

        int nums = 0;
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == ' ') {
                nums++;
            }
            i++;
        }
        System.out.println("\nThe number of words is : " + ++nums);
        scanner.close();
    }
}
