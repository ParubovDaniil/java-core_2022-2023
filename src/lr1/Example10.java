package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int birthyear, nowyear, age;
        System.out.println("Input birth year");
        birthyear = num.nextInt();
        nowyear = 2022;
        age = nowyear - birthyear;
        System.out.println("Age-" + age + " +-1 year" );
        num.close();
    }
}