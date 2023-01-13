package timus.task_1263;

import java.util.Scanner;

public class task_1263 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int bin,sum = 0;
        int n = in.nextInt();
        int m = in.nextInt();
        int [] massiv = new int [n];
        for(int i = 0; i < m; i++) {
            bin = in.nextInt();
            sum = sum + 1;
            massiv[bin-1] = massiv[bin-1] + 1;
        }
        for(int i = 0; i < n; i++){
            System.out.println(String.format("%.2f", massiv[i]/(sum*0.01))+"%");
        }
    }
}
