package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = line.nextLine();
        Scanner num = new Scanner(System.in);
        int birthyear, nowyear, age;
        System.out.println("Input birth year");
        birthyear = num.nextInt();
        nowyear = 2022;
        age = nowyear - birthyear;
        System.out.println("Name: " + name+ " " +"Age: " + age + " +-1 year");
        num.close();
    }
}