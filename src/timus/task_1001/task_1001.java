package timus.task_1001;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class task_1001 {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        ArrayList<Double> f = new ArrayList<Double>();

        while (in.hasNextLong()) {
            f.add((double) Math.sqrt(in.nextLong()));
        }
        for(int i = f.size()-1;i>=0;i--){
            out.printf("%8.6f\n",f.get(i));
        }
    }
}