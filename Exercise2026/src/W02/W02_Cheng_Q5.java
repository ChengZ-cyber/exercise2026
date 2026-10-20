/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W02;

public class W02_Cheng_Q5 {
    public static void main(String[] args) {
        // 0 to 10000 inclusive, so multiply by 10001
        int number = (int) (Math.random() * 10001);

        int temp = number;
        int digitSum = 0;
        while (temp > 0) {
            digitSum += temp % 10;   // take the last digit
            temp /= 10;              // remove the last digit
        }

        System.out.println("The number is " + number);
        System.out.println("The sum of all the digits is " + digitSum);
    }
}