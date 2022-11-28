package lr2;
import java.util.Scanner;
public class Example3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число, для проверки на удовлетворение критериям: - (при делении на 5 в остатке получается 2,а при делении на 7 в остатке получается 1)");
        int x = in.nextInt();

        if (x % 5 == 2 & x % 7 == 1)
            System.out.println("Введенное вами число удовлетворяет критериям");
        else System.out.println("Введенное вами число не удовлетворяет критериям");
    }

}
