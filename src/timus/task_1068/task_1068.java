package timus.task_1068;

import java.util.Scanner;

public class task_1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 0;
        if (a > 0) {
            for (int i = 1; i <= a; i++)
                b = b + i;
            System.out.println(b);
        }
        else if (a <= 0) {
            for (int i = a; i <= 1; i++)
                b = b + i;
            System.out.println(b);
        }
    }
}
