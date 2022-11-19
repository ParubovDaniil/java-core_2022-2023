package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float num1, num2,result;
        System.out.println("Input first number: ");
        num1 = num.nextInt();
        System.out.println("Input second number: ");
        num2 = num.nextInt();
        result = num1 + num2;
        System.out.println("Sum result : " + result);
        num.close();
    }
}
