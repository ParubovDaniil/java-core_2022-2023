package lr7.Example3;

public class sub2 extends sub1 {
    sub2(int int1) {
        super(int1);
    }
    public String str1;

    public void setStr1(String str1, int int1, char ch1) {
        this.str1 = str1;
        super.int1 = int1;
        super.ch1 = ch1;
    }
    sub2(String str1, int int1, char ch1) {
        super(ch1, int1);
        this.setStr1(str1, int1, ch1);
    }
    public String getStr1() {
        return str1;
    }
    public String toString() {
        String vozvrat2;
        vozvrat2 = " " + this.getStr1();
        return super.toString() + vozvrat2;
    }
}
