package lr12;
/*Напишите функцию, которая принимает на вход список строк и возвращает новый список,
 содержащий только те строки, которые содержат заданную подстроку*/
import java.util.List;
import java.util.Scanner;


public class Example5 {
    public static void main(String[] args){
        String string = "Напишите функцию, которая принимает на вход список строк и " +
                "возвращает новый список, содержащий только те строки, которые содержат " +
                "заданную подстроку.";

        List<String> strings = List.of(string.split(","));
        System.out.println("\nСтрока после считывания: \n");
        for(String a : strings){
            System.out.println(a);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Введите подстроку: ");
        String subString = in.nextLine();

        List<String> stringAfter = filterSubString(strings, subString);

        System.out.println("\nСтрока после фильтрации:\n");
        for(String a : stringAfter){
            System.out.println(a);
        }

    }

    public static List<String> filterSubString(List<String> strings, String subString){
        return strings.stream().filter(s -> s.contains(subString)).toList();
    }

}

