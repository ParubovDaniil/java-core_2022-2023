package lr7.Example3;

public class sub1 extends sup {
    sub1(int int1) {
        super(int1);
    }
    public char ch1;

    public void setCh1(char ch1, int int1) {
        this.ch1 = ch1;
        super.int1 = int1;
    }
    sub1(char ch1, int int1) {
        super(int1);
        this.setCh1(ch1,int1);
    }
    public char getCh1() {
        return ch1;
    }
    public String toString() {
        String vozvrat2;
        vozvrat2 = " " + this.getCh1();
        return super.toString() + vozvrat2;
    }
}