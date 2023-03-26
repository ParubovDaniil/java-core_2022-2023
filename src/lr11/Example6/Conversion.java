package lr11.Example6;
import java.util.Scanner;
public class Conversion {
    /*
     * 2. Создать приложение с использованием рекурсии для перевода
     * целого числа, введенного с клавиатуры, в двоичную систему счисления.
     */
            public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input number for conversion 10 in 2: ");
            int numb = in.nextInt();

            if (numb == 0){
                System.out.println("0");
            }else {
                System.out.println(conversion(numb));
            }
        }
        public static String conversion(int number){
            if (number == 0){
                return "";
            }
            return conversion(number/2) + (number % 2);
        }
    }

