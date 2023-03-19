package lr10.Example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Node;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Scanner;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.apache.commons.io.output.TeeOutputStream;
public class NewsParser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            try {
                Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
                ByteArrayOutputStream buffer = new ByteArrayOutputStream();
                OutputStream teeStream = new TeeOutputStream(System.out, buffer);
                // После этой строки любой вывод будет сохраняться в buffer
                System.setOut(new PrintStream(teeStream));
                Elements newsParent = doc
                        .select("body > table > tbody > tr > td > div > table > " +
                                "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                                "tr > td:nth-child(1)");

                for (int i = 3; i < 20; i++) {
                    if (!(i % 2 == 0)) {
                        List<Node> nodes = newsParent.get(0).childNodes();
                        System.out.println("Тема: " +
                                ((Element) nodes.get(i))
                                        .getElementsByClass("blocktitle")
                                        .get(0).childNodes().get(0));

                        System.out.println("Дата: " +
                                ((Element) nodes.get(i))
                                        .getElementsByClass("blockdate")
                                        .get(0).childNodes().get(0) + "\n");
                    }
                }
                // Сохраняем buffer в файл
                try(OutputStream fileStream = new FileOutputStream("src/lr10/example3/console.txt")) {
                    buffer.writeTo(fileStream);
                }
            } catch (IOException e) {
                throw new UnknownHostException("Ошибка подключения к сайту");
            }
        }
        catch (UnknownHostException exception)
        {
            System.out.println(exception);
            System.out.println("Повторить подключение? (1 - да/0 - нет)");
            int reconnect = in.nextInt();
            if (reconnect == 1)
            {
                NewsParser.main(args);
            }
        }
    }
}
