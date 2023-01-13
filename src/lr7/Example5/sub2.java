package lr7.Example5;

public class sub2 extends sup {

    protected char ch1;

    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }
    sub2(String str1, char ch1) {
        super(str1);
        this.setCh1(ch1);
    }
    public char getCh1() {
        return ch1;
    }
    public void classPrint() {
        String sub2Class;
        sub2Class = "" + this.getCh1();
        super.classPrint();
        System.out.println(sub2Class);
    }
}