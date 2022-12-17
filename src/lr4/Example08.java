package lr4;
import java.util.Scanner;
public class Example08 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);// Создание объекта класса Scanner
        // При запуске программы в консоль необходимо вывести сообщение: «Введите текст для шифрования»,
        System.out.print("Введите текст для шифрования: ");
        String text = id.nextLine();
        // после ввода текста, появляется сообщение: «Введите ключ».
        System.out.print("Введите ключ: ");// пользоватьелю
        int shift = id.nextInt();
        String encryptStr = Caeser.encrypt(text, shift);
        // После того как введены все данные, необходимо вывести преобразованную строку с сообщением «Текст после преобразования : ».
        System.out.print("Текст после преобразования :" + "\"" + encryptStr + "\"");
        // Далее необходимо задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
        System.out.print("\nВыполнить обратное преобразование? (y/n)"); // пользователю
        boolean cool = false;
        while (!cool) {
            String reply = id.next();
            // если пользователь вводит «y», тогда выполнить обратное преобразование.
            if (reply.toLowerCase().equals("y")) {
                String decryptStr = Caeser.decrypt(encryptStr, shift);
                System.out.println(decryptStr);
                cool = true;
            }
            // Если пользователь вводит «n», того программа выводит сообщение «До свидания!».
            else if (reply.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                cool = true;
            }
            // Если пользователь вводит что-то другое, отличное от «y» или «n»,
            // то программа ему выводит сообщение: «Введите корректный ответ».
            else {
                System.out.println("Введите корректный ответ: ");
                cool = false;
            }
        }
    }
    private static class Caeser {
        static String encryptText;
        private static String encrypt(String enText, int key)
        {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] + key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);
            return encryptText;
        }

        private static String decrypt(String enText, int key)
        {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] - key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);
            return encryptText;
        }
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
