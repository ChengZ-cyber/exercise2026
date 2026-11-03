package W05;

import java.util.Scanner;

// Lab 4, question 3: read exam scores until a negative score, then print the minimum, maximum,
// average and standard deviation s = sqrt((sum of X^2 - (sum of X)^2 / N) / (N - 1)).
// Test: 75 34 58 12 96 -1 -> min 12, max 96, average 55.00, standard deviation 33.09.
public class W05L03 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int count = 0;
        double sum = 0, sumOfSquares = 0;
        double min = 0, max = 0;

        System.out.print("Enter a score [negative score to quit]: ");
        double score = keyboard.nextDouble();
        while (score >= 0) {                             // a negative score is the sentinel
            count++;
            sum += score;
            sumOfSquares += score * score;
            if (count == 1 || score < min) {             // the first score is both min and max
                min = score;
            }
            if (count == 1 || score > max) {
                max = score;
            }
            System.out.print("Enter a score [negative score to quit]: ");
            score = keyboard.nextDouble();
        }

        if (count < 2) {                                 // N - 1 must not be 0
            System.out.println("Enter at least two scores.");
        } else {
            double average = sum / count;
            double sd = Math.sqrt((sumOfSquares - sum * sum / count) / (count - 1));
            System.out.printf("Minimum Score: %.0f%n", min);
            System.out.printf("Maximum Score: %.0f%n", max);
            System.out.printf("Average Score: %.2f%n", average);
            System.out.printf("Standard Deviation: %.2f%n", sd);
        }
        keyboard.close();
    }
}
