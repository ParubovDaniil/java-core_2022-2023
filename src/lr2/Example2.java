package lr2;
import java.util.Scanner;
public class Example2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое число для проверки,делится ли оно на 3");
        int x = in.nextInt();
        if (x % 3 == 0)
            System.out.println("Введёное вами число делится на 3 без остатка");
        else System.out.println("Введенное вами число не делится на 3 без остатка");
    }

}
