package lr4;
import java.util.Arrays;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String value = in.nextLine();
        System.out.println("Введите клю для шифрования");
        int key = in.nextInt();
        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];
        System.out.println("chars до преобразования"+Arrays.toString(chars));
        for(int i=0;i<chars.length;i++){
            ints[i] = chars[i]+key;
        }
        System.out.println("ints после преобразования" + Arrays.toString(ints));
        for(int i=0;i<chars.length;i++){
            chars[i] = (char) ints[i];
        }
        System.out.println("chars после преобразования" + Arrays.toString(chars));
}

}
//        Напишите программу «Шифр Цезаря», которая зашифровывает
//        введенный текст. Используете кодовую таблицу символов. При запуске
//        программы в консоль необходимо вывести сообщение: «Введите текст для
//        шифрования», после ввода текста, появляется сообщение: «Введите ключ».
//        После того как введены все данные, необходимо вывести преобразованную
//        строку с сообщением «Текст после преобразования : ». Далее необходимо
//        задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
//        если пользователь вводит «y», тогда выполнить обратное преобразование.
//        Если пользователь вводит «n», того программа выводит сообщение «До
//        свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
//        то программа ему выводит сообщение: «Введите корректный ответ».
