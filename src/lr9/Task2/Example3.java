package lr9.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {
        static Scanner vision = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Сумма чисел массива типа Byte: " + getSum(setArray()));
        }

        public static byte[] setArray() {
            System.out.print("Введите размер массива: ");
            int chislo = vision.nextInt();
            byte[] Array = new byte[chislo];
            try {
                for (int f = 0; f < Array.length; f++) {
                    Array[f] = vision.nextByte();
                }

            } catch (InputMismatchException e) {
                System.out.println("Исключение: " + e.toString());
            }
            return Array;
        }

        public static byte getSum(byte[] stroy) {
            byte summa = 0;
            for (byte z : stroy) {
                summa += z;
            }
            return summa;
        }

    }

