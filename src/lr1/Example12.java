package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int birthyear, nowyear, age;
        System.out.println("Input age: ");
        age = num.nextInt();
        nowyear = 2022;
        birthyear = nowyear - age;
        System.out.println("Birth year: " + birthyear + " +- 1 year");
        num.close();
    }
}

