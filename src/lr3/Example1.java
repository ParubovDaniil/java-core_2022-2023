package lr3;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число в диапазоне от 1 до 7");
        String day = in.nextLine();
            switch (day) {
                case "1":
                    System.out.println("Понедельник");
                    break;
                case "2":
                    System.out.println("Вторник");
                    break;
                case "3":
                    System.out.println("Среда");
                    break;
                case "4":
                    System.out.println("Четверг");
                    break;
                case "5":
                    System.out.println("Пятница");
                    break;
                case "6":
                    System.out.println("Суббота");
                    break;
                case "7":
                    System.out.println("Воскресенье");
                    break;
                default:
                    System.out.println("Введено некорректное значение");
        }
    }

}
//        Напишите программу, в которой пользователь вводит целое число
//        в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
//        Если введенное пользователем число выходит за допустимый диапазон,
//        выводится сообщение о том, что введено некорректное значение. Используйте
//        оператор выбора switch.