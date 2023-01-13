package timus.task_2066;

import java.util.Scanner;

public class task_2066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>=0 && b>=0 && c>=0 && a<=100 && b<=100 && c<=100 && a<=b && b<=c){
            if(a==0 && b==0 || a==0 && b==1|| a==1&& b==1|| b==0||c==0||(a==1&& b==1&&c==1)){
                System.out.println(a-b-c);
            }
            else  System.out.println(a-b*c);
        }
    }
}