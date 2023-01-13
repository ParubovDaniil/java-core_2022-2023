package timus.task_1785;

import java.util.Scanner;

public class task_1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num >= 1 && num <= 4) {
            System.out.println("few");
        } else if (num >= 5 && num <= 9) {
            System.out.println("several");
        } else if (num >= 10 && num <= 19) {
            System.out.println("pack");
        } else if (num >= 20 && num <= 49) {
            System.out.println("lots");
        } else if (num >= 50 && num <= 99) {
            System.out.println("horde");
        } else if (num >= 100 && num <= 249) {
            System.out.println("throng");
        } else if (num >= 250 && num <= 499) {
            System.out.println("swarm");
        } else if (num >= 500 && num <= 999) {
            System.out.println("zounds");
        } else if (num >= 1000) {
            System.out.println("legion");
        }
        System.out.flush();

    }
}