package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();

        List<Integer> list = new ArrayList<Integer>(size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println("Список list: ");
        System.out.println(list);

        System.out.println("Введите число, с которым нужно сравнивать: ");
        int chisl = in.nextInt();

        List<Integer> listResult = filterChislo(list, chisl);

        System.out.println("Список listResult: ");
        System.out.println(listResult);
    }

    public static List<Integer> filterChislo(List<Integer> arr, int chisl) {
        return arr.stream()
                .filter(x -> x < chisl)
                .collect(Collectors.toList());
    }
}
