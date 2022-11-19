package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float num1, num2, num3, num4, num5;
        System.out.println("Input num: ");
        num1 = num.nextInt();
        num2 = num1+1 ;
        num3 = num1-1 ;
        num4 = (num1+num2+num3);
        num5 = num4*num4;
        System.out.println(" "+num1+" "+num2+" "+num3+" "+num5);
        num.close();
    }
}
