package lr7.Example2;

public class sub extends sup {
    public int int1;
    private String str2;

    sub() {setStr1();}
    sub(String str2) {setStr1(str2);}
    sub(int int1) {setStr1(); this.setInt1(int1);}
    sub(String str2, int int1) {setStr1(str2); this.setInt1(int1);}

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    public void setStr1() {
        this.str2 = "пусто";
    }
    public void setStr1(String str2) {
        this.str2 = str2;
    }
    public int getStr2l() {
        return str2.length();
    }
    public int getInt1(){
        return int1;
    }
    public String getStr2(){
        return str2;
    }
    public String toString() {
        String subClass = getStr2() + " " + getStr2l() + " " + getInt1();
        return subClass;
    }
}
