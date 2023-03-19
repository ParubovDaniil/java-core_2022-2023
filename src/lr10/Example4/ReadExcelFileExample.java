package lr10.Example4;

import lr10.Example3.LinkParser;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadExcelFileExample {
    public static void main(String[] args) throws IOException {
        main(args, 0);
    }

    public static void main(String[] args, int i) throws IOException {
        Scanner in = new Scanner(System.in);
        try {

            String filePath = null;
            if (i ==0)
            {
                filePath = "src/lr10/Example4/ExampleExcel.xlsx";//путь не правильный, сделано для провертки catch-а,
                // в консоли нужно будет ввести: src/lr10/example4/exampleExel.xlsx
            }
            else if (i>0)
            {
                System.out.println("Введите полный путь к файлу: ");
                filePath = in.nextLine();
            }
            FileInputStream inputStream = new FileInputStream(filePath);

            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            XSSFSheet sheet = workbook.getSheet("Товары");

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.println(cell.toString() + "\t");
                }
                System.out.println();
            }
            workbook.close();
            inputStream.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Файл не найден");
            System.out.println("Попробовать еще раз? (1 - да/ 0 - нет)");
            int reconnect = in.nextInt();
            if (reconnect == 1)
            {
                ReadExcelFileExample.main(args,1);
            }

        }
    }
}
