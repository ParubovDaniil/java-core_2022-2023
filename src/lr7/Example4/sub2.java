package lr7.Example4;

public class sub2 extends sub1 {
    sub2(String str1, char ch1) {
        super(ch1, str1);
    }
    public int int1;
    public void setInt1 (char ch1, String str1, int int1) {
        super.ch1 = ch1;
        super.str1 = str1;
        this.int1 = int1;
    }
    sub2(char ch1, String str1, int int1) {
        super(ch1, str1);
        this.setInt1(ch1, str1, int1);
    }
    sub2(sub2 copy) {
        super(copy.ch1, copy.str1);
        this.setInt1(copy.ch1, copy.str1, copy.int1);
    }
    public int getInt1() {
        return int1;
    }
    public String toString() {
        String sub2Class;
        sub2Class = " " + this.getInt1();
        return super.toString() + sub2Class;
    }
}
