package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input weekday: ");
        String weekday = in.nextLine();

        System.out.println("Input date: ");
        int date = in.nextInt();

        System.out.println("Input month (1-12): ");
        int month = in.nextInt();

        System.out.println("Weekday: " + weekday);
        System.out.println("Date: " + date);
        System.out.println("Month: " + month);
        in.close();
    }
}
