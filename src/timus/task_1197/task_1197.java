package timus.task_1197;

import java.util.Scanner;

public class task_1197 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,x,y,flag = 0;
        char x1,y1;
        String s = "  ";
        n=in.nextInt();
        for(int q = 0; q < n; q++) {
            s=in.next();
            x1=s.charAt(0);
            y1=s.charAt(1);
            x = (int) x1-96;
            y = (int) y1-48;
            for(int i = -2; i <= 2; i++) {
                for(int j= -2;j <= 2; j++) {
                    if (j != i) {
                        if(x-i > 0 & y-j > 0 & x-i < 9 & y-j < 9) {
                            if(i * i + j * j == 5) {
                                flag++;
                            }
                        }
                    }
                }
            }
            System.out.println(flag);
            flag = 0;
        }
    }
}