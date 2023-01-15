package lr8.Example1;

import java.io.*;

public class Primer6 {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("D:/lab8/pr6\\MyFile1.txt");
            out = new FileWriter("D:/lab8/pr6\\MyFile2.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                //out.write((char)oneByte);
                out.append((char)oneByte);
                System.out.println((char)oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!");
        }
        finally {
            in.close();
            out.close();
        }
    }
}
