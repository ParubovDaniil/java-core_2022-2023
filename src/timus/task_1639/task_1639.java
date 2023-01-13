package timus.task_1639;

import java.util.Scanner;

public class task_1639 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = (n*m)%2;
        System.out.println((a!=0)?("[second]=:]"):("[:=[first]"));
    }
}