package lr7.Example4;

public class sup {
    public char ch1;
    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }
    sup(char ch1) {
        this.setCh1(ch1);
    }
    sup(sup copy) {
        this.setCh1(copy.ch1);
    }
    public char getCh1() {
        return ch1;
    }
    public String toString() {
        String supClass;
        supClass = this.getClass().getSimpleName() + " " + this.getCh1();
        return supClass;
    }
}
