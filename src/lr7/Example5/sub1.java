package lr7.Example5;

public class sub1 extends sup {
    protected int int1;

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    sub1(String str1, int int1) {
        super(str1);
        this.setInt1(int1);
    }
    public int getInt1() {
        return int1;
    }
    public void classPrint() {
        String sub1Class;
        sub1Class = "" + this.getInt1();
        super.classPrint();
        System.out.println(sub1Class);
    }
}
