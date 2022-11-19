package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input Month: ");
        String month = in.nextLine();

        System.out.println("Input The number of days: ");
        int nod = in.nextInt();

        System.out.println("The Month of " + month + " " + "has" + " " + nod + " " + "days");
        in.close();
    }
}