package timus.task_1409;

import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int gar = in.nextInt();
        int lar = in.nextInt();

        int banki = gar + lar -1;
        int garry = banki - gar;
        int larry = banki - lar;

        System.out.println(garry + " " + larry);
    }
}