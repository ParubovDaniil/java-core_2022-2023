package lr6;
public class Example7 {
    public static void main(String[] args) {
        char [] a ={ 'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        a = mass(a, 3);
        int b[] = mas(a, 3);
        System.out.println(a);
        System.out.println(b);
    }
    static int[] mas(char[] symb, int dlina)
    {
        int[] num = new int[dlina];
        for(int i = 0; i < dlina; i++)
        {
            num[i] = (int) symb[i];
        }
        return num;

    }
    static char[] mass(char[] symb, int dlina)
    {
        int[] num = new int[dlina];
        for(int i = 0; i < dlina; i++)
        {
            num[i] = (int) symb[i];
        }
        return symb;

    }
}
//        Напишите программу со статическим методом, аргументом которому передастся
//        символьный массив, а результатом возвращается ссылка на целочисленным массив,
//        состоящий из кодов символов из массива- аргумента.