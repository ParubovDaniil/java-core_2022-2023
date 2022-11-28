package lr2;
import java.util.Scanner;
public class Example4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число, для проверки на удовлетворение критериям: - (число делится на 4, и при этом оно не меньше 10)");
        int x = in.nextInt();

        if (x % 4 == 0 & x > 10)
            System.out.println("Введенное вами число удовлетворяет критериям");
        else System.out.println("Введенное вами число не удовлетворяет критериям");
    }

}
