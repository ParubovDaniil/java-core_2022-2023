package lr11.Example2;

public class Recursion{
    public static void m(int x) {
        if ( (2*x+1) <20) {
            m(2*x+1);
        }
        System.out.println("x="+x);
    }
    public static void main(String[] args) {
        m(1);
    }
}
