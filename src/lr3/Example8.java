package lr3;

public class Example8 {
    public static void main(String[] args) {
        int n = 10;
        char[] symbol = new char[n];
        char[] vowels = new char[] {'A', 'E', 'I', 'O', 'U', 'Y'};
        char b = 'A';
        int i = 0;
        int j = 0;
        for(i = 0; i < n; i++) {
            boolean statement = true;
            for(j = 0; j < vowels.length; j++) {
                if(b == vowels[j]) {
                    i--;
                    statement = false;
                    break;
                }
            }
            if(statement) {
                symbol[i] = b;
            }
            b++;
        }
        for(int k = 0; k < n; k++){
            System.out.print(symbol[k] + "\t");
        }
    }
}
//        Напишите программу, в которой создается символьный массив из
//        10 элементов. Массив заполнить большими (прописными) буквами
//        английского алфавита. Буквы берутся подряд, но только согласные (то есть
//        гласные буквы ’ А ' , 1 Е ' и ' I ' при присваивании значений элементам массива
//        нужно пропустить). Отобразите содержимое созданного массива в консольном
//        окне