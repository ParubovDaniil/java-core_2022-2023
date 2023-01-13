package lr7.Example4;

public class Example4 {
    public static void main(String[] args) {
        sup supTest = new sup('z');
        String supResult = supTest.toString();
        System.out.println(supResult);

        sup supTestCopy = new sup(supTest);
        String supResultCopy = supTestCopy.toString();
        System.out.println(supResultCopy);

        sub1 sub1Test = new sub1('x', "XXX");
        String sub1Result = sub1Test.toString();
        System.out.println(sub1Result);

        sub1 sub1TestCopy = new sub1(sub1Test);
        String sub1ResultCopy = sub1TestCopy.toString();
        System.out.println(sub1ResultCopy);

        sub2 sub2Test = new sub2('c', "CCC", 13);
        String sub2Result = sub2Test.toString();
        System.out.println(sub2Result);

        sub2 sub2TestCopy = new sub2(sub2Test);
        String sub2ResultCopy = sub2TestCopy.toString();
        System.out.println(sub2ResultCopy);
    }
}
//Напишите программу, в которой использована цепочка наследования из трех
//классов. В первом классе есть открытое символьное поле. Во втором классе появляется
//открытое текстовое поле. В третьем классе появляется открытое целочисленное поле.
//В каждом из классов должен быть конструктор, позволяющий создавать объект на основе
//значений полей, переданных аргументами конструктору, а также конструктор создания копии.
