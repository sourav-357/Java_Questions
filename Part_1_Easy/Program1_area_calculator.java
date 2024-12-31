package Part_1_Easy;

import java.util.Scanner;

public class Program1_area_calculator {

    // Write a program to calculate the area of a circle, rectangle, and triangle using user input.

    public static void triangle ( float a, float b ) {
        System.out.println("The area of the triangle is : " + 0.5 * (a * b) + "\n\n----------");
    }
    public static void circle ( float radius ) {
        System.out.println("The area of the circle is : " + (3.14 * radius * radius) + "\n\n----------");
    }
    public static void rectangle ( float length, float width ) {
        System.out.println("The area of the rectangle is : " + (length * width) + "\n\n----------");
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nPlease enter the height of the triangle : ");
        float a = sc.nextFloat();
        System.out.print("Please enter the base of the triangle : ");
        float b = sc.nextFloat();
        triangle(a, b);

        System.out.print("\nPlease enter the radius of the circle : ");
        float radius = sc.nextFloat();
        circle(radius);

        System.out.print("\nEnter the length of the rectange : ");
        float length = sc.nextFloat();
        System.out.print("Enter the width of the rectange : ");
        float width = sc.nextFloat();
        rectangle(length, width);

        sc.close();
    }
}