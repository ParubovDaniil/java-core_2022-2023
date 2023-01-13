package lr7.Example3;

public class sup {
    public int int1;

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    sup(int int1) {
        this.setInt1(int1);
    }
    public int getInt1() {
        return int1;
    }
    public String toString() {
        String vozvrat;
        vozvrat = this.getClass().getSimpleName() + " " + this.getInt1();
        return vozvrat;
    }
}
