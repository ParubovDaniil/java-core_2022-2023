package lr7.Example5;

public class sup {
    protected String str1;

    public void setStr1(String str1) {
        this.str1 = str1;
    }
    sup(String str1) {
        this.setStr1(str1);
    }
    public String getStr1() {
        return str1;
    }
    public void classPrint() {
        String supClass;
        supClass = this.getClass().getSimpleName() + " " + getStr1();
        System.out.println(supClass);
    }
}