package lr8.Example1;

import java.io.*;
import java.util.Scanner;

public class Primer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя файла => ");
        String fName = sc.nextLine();
        try {
            File f1 = new File(fName);
            f1.createNewFile();
            System.out.println("Полный путь файла: " + f1.getAbsolutePath());
            System.out.print("Введите количество строк для записи в файл => ");
            int n = sc.nextInt();

            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.print("Введите строку для записи в файл => ");
                String s = sc.nextLine();
                dOut.writeUTF(s);
            }
            dOut.flush();
            dOut.close();

            DataInputStream dln = new DataInputStream(new FileInputStream(f1));
            while (true) {
                System.out.println(dln.readUTF());
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
