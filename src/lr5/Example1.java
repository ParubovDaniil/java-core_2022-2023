package lr5;

public class Example1 {
    public static void main(String[] args) {
        Task Task1 = new Task();
        Task1.viewCode();

        Task1.Set('A');
        System.out.println("Char code = " + Task1.getCodeSymbol()+"\n");

        Task1.viewCode();
    }
}
class Task {
    // Создание закрытой переменной ch1
    private char ch;
    //Один из методов позволяет присвоить значение полю.
    public void Set(char ch1) {
        this.ch = ch1;
    }
    //Еще один метод при вызове возвращает результатом код символа.
    public int getCodeSymbol() {
        return (int) ch;
    }
    //Третий метод позволяет вывести в консольное окно символ (значение поля) и его код.
    public void viewCode() {
        System.out.println("ch1 = " + ch);
        //int code = ch;
        System.out.println("ch1 = " + getCodeSymbol()+"\n");
    }
}
//        Напишите программу с классом, в котором есть закрытое символьное поле
//        и три открытых метода. Один из методов позволяет присвоить значение полю.
//        Еще один метод при вызове возвращает результатом код символа. Третий
//        метод позволяет вывести в консольное окно символ (значение поля) и его код.