package lr11.Example10;

/*
 * 10. Заполнить HashMap 10 объектами <Integer, String>. Найти строки, у которых ключ > 5.
 * Если ключ = 0, вывести строки через запятую. Перемножить все ключи, где длина строки > 5.
 */
import java.util.HashMap;
import java.util.Map;

public class Example {

    public static void main(String[] args) {
        Map<Integer, String> data = getFilledMapWithTenObjects();
        System.out.println(findRowsWithAKeyGreaterThanFive(data));
        findRowsWithAKeyValueZero(data);
        System.out.println();
        System.out.println(findStringsWithLengthGreaterThanFive(data));
    }

    public static Map<Integer, String> getFilledMapWithTenObjects() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Daniil");
        map.put(1, "Ivan");
        map.put(2, "Vladislav");
        map.put(3, "Andrey");
        map.put(4, "Mihail");
        map.put(5, "Dimon");
        map.put(6, "Alexey");
        map.put(7, "Elvira");
        map.put(8, "Slava");
        map.put(9, "Tanya");
        return map;
    }

    public static Map<Integer, String> findRowsWithAKeyGreaterThanFive(Map<Integer, String> map) {
        Map<Integer, String> newMap = new HashMap<>();
        for (Map.Entry<Integer, String> set : map.entrySet()) {
            if (set.getKey() > 5) {
                newMap.put(set.getKey(), set.getValue());
            }
        }
        return newMap;
    }

    public static void findRowsWithAKeyValueZero(Map<Integer, String> map) { // как найти строки, если HashMap не хранит одинаковые ключи?
        map.entrySet().stream()
                .filter(e -> e.getKey() == 0)
                .forEach(e -> System.out.print(e.getValue() + ", "));
    }

    public static int findStringsWithLengthGreaterThanFive(Map<Integer, String> map) {
        int sum = 0;
        for (Map.Entry<Integer, String> set : map.entrySet()) {
            if (set.getValue().length() > 5) {
                sum += set.getKey();
            }
        }
        return sum;
    }
}
