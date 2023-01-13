package lr7.Example4;

public class sub1 extends sup {
    sub1(char ch1) {
        super(ch1);
    }
    public String str1;

    public void setStr1(char ch1, String str1) {
        super.ch1 = ch1;
        this.str1 = str1;
    }
    sub1(char ch1, String str1) {
        super(ch1);
        this.setStr1(ch1, str1);
    }
    sub1(sub1 copy) {
        super(copy.ch1);
        this.setStr1(copy.ch1, copy.str1);
    }
    public String getStr1() {
        return str1;
    }
    public String toString() {
        String sub1Class;
        sub1Class = " " + getStr1();
        return super.toString() + sub1Class;
    }
}