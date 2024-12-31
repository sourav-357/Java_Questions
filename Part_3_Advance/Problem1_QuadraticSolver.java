package Part_3_Advance;

// Quadratic Equation Solver
import java.util.Scanner;

public class Problem1_QuadraticSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
        }
        else {
            double discriminant = b * b - 4 * a * c;
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Real and distinct roots: " + root1 + " and " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("Real and equal root: " + root);
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("Imaginary roots: " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
            }
        }
        
        sc.close();
    }
}

