package lr7.Example2;

public class sup {
    private String str1;

    sup() {setStr1();}
    sup (String str1) {setStr1(str1);}

    public void setStr1() {
        this.str1 = "пусто";
    }
    public void setStr1(String str1) {
        this.str1 = str1;
    }
    public String getStr1() {
        return str1;
    }
    public int getStr1l() {
        return str1.length();
    }
    public String toString() {
        String supClass = getStr1() + " " + getStr1l();
        return supClass;
    }
}
