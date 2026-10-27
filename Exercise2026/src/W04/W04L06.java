package W04;

import java.util.Scanner;

// Lab 3, question 6: read the radius of a circle centered at (0, 0) and a point (x, y),
// then print whether the point is inside or outside the circle.
// Test: radius 5, point (3, 4) -> inside (on the edge); radius 5, point (4, 4) -> outside.
public class W04L06 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = keyboard.nextDouble();

        System.out.print("Enter the point (x y): ");
        double x = keyboard.nextDouble();
        double y = keyboard.nextDouble();

        double distance = Math.sqrt(x * x + y * y);      // distance from the point to the centre (0, 0)

        if (distance <= radius) {                        // a point on the edge counts as inside
            System.out.printf("The point (%.1f, %.1f) is inside the circle.%n", x, y);
        } else {
            System.out.printf("The point (%.1f, %.1f) is outside the circle.%n", x, y);
        }
        keyboard.close();
    }
}
