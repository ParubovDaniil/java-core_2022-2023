package timus.task_2031;

import java.util.Scanner;

public class task_2031 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            System.out.println("01");
        } else if (n == 2) {
            System.out.println("11 01");
        } else if (n == 3) {
            System.out.println("16 06 68");
        } else if (n == 4) {
            System.out.println("16 06 68 88");
        } else {
            System.out.println("Glupenky Pierre");
        }
    }
}