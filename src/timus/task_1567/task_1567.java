package timus.task_1567;

import java.util.Scanner;

public class task_1567 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char a[] = s.toCharArray();

        int count = 0;
        for(int i = 0; i < s.length(); i++){
            count = count+getCount(a[i]);
        }
        System.out.println(count);
        in.close();
    }
    private static int getCount(char a) {
        int count =0;
        if (a == 'a' || a == 'd' || a == 'g' || a== 'j' || a== 'm' || a == 'p' || a == 's' || a== 'v' || a == 'y'
                || a== '.' || a== ' ') {
            count++;
        }
        if (a== 'b' || a == 'e' || a== 'h' || a == 'k' || a == 'n' || a == 'q' || a== 't' || a== 'w' || a== 'z'
                || a == ',') {
            count = count + 2;
        }
        if (a== 'c' || a== 'f' || a == 'i' || a == 'l' || a== 'o' || a== 'r' || a == 'u' || a== 'x' || a == '!') {
            count = count + 3;
        }
        return count;
    }
}