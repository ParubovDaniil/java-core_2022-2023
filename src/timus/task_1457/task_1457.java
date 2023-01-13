package timus.task_1457;

import java.util.Scanner;

public class task_1457 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0;
        double n = in.nextLong();

        for (int i = 0; i < n; i++) {
            a = a + in.nextLong();
        }
        double k = a / n;
        System.out.print((k));
    }
}