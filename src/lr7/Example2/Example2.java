package lr7.Example2;

public class Example2 {
    public static void main(String[] args) {
        sup supTest = new sup();
        String supResult1 = supTest.toString();
        System.out.println(supResult1);

        sup supTest2 = new sup("test this");
        String supResult2 = supTest2.toString();
        System.out.println(supResult2);

        sup supTest3 = new sub();
        String supResult3 = supTest3.toString();
        System.out.println(supResult3);

        sup supTest4 = new sub("test this too");
        String supResult4 = supTest4.toString();
        System.out.println(supResult4);

        sup supTest5 = new sub(256);
        String supResult5 = supTest5.toString();
        System.out.println(supResult5);

        sup supTest6 = new sub("test this and this", 256);
        String supResult6 = supTest6.toString();
        System.out.println(supResult6);
    }
}
//Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
//базовом классе должен быть метод для присваивания значения полю: без параметров и с
//одним текстовым параметром. Объект суперкласса создается передачей одного текстового
//аргумента конструктору. Доступное только для чтения свойство результатом возвращает
//длину текстовой строки. На основе суперкласса создается подкласс. В подклассе появляется
//дополнительное открытое целочисленное поле. В классе должны быть такие версии метода
//для присваивания значений полям (используется переопределение и перегрузка метода из
//суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
//текстовым и целочисленным параметром. У конструктора подкласса два параметра (целочисленный и текстовый).