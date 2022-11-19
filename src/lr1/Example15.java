package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float num1, num2, sum, difference;
        System.out.println("Input first num: ");
        num1 = num.nextInt();
        System.out.println("Input second num: ");
        num2 = num.nextInt();
        sum = num1 + num2;
        difference = num1 - num2;
        System.out.println("First num = "+ num1);
        System.out.println("Second num = "+ num2);
        System.out.println("Sum = "+sum);
        System.out.println("Difference = "+difference);
        num.close();
    }
}
