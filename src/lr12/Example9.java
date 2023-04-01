package lr12;

import java.util.List;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        String string = "9. Напишите функцию, которая принимает на вход список строк и " +
                "возвращает новый список, содержащий только те строки, которые содержат " +
                "только буквы (без цифр и символов).";
        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСтрока после считывания: \n");
        for(String a : strings){
            System.out.println(a);
        }

        List<String> stringPosle = filterTolkoSlova(strings);

        System.out.println("\nСтрока после фильтрации:\n");
        for(String s : stringPosle){
            System.out.println(s);
        }


    }

    public static List<String> filterTolkoSlova(List<String> strings){
        return strings.stream().filter(a -> a.matches("[а-яА-Я]+")).toList();
    }
}