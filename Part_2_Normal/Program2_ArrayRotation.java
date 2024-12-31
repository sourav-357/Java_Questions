package Part_2_Normal;

import java.util.Scanner;

public class Program2_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of positions to rotate left: ");
        int rotations = scanner.nextInt();

        rotations %= n; // Ensure rotations are within bounds
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + rotations) % n];
        }

        System.out.println("Rotated Array:");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
