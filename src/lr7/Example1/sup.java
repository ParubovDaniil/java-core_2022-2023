package lr7.Example1;

public class sup {
    private String str1;
    sup(String strEx) {
        this.str1 = strEx;
    }
    sup() {
        this.str1 = "нет параметров";
    }
    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "sup" + "\n" + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1();
        return superClassNameAndFieldValue;
    }
    public String getStr1() {
        return str1;
    }
    public void setStr1(String str1) {
        this.str1 = str1;
    }
}