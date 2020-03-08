package pl.sda.zamowienia;

public class Category {
    private int A;
    private int B;
    private int C;

    public Category(int a, int b, int c) {
        A = a;
        B = b;
        C = c;
    }
    public Category(String a, String b, String c){

    }

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public int getC() {
        return C;
    }

    public void setC(int c) {
        C = c;
    }
}
