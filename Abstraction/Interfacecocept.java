package Abstraction;

public interface Interfacecocept {
    public void add(int a,int b);
    public void subs(int c,int d);
    public void mult(int e,int f);
}
class Concept1 implements Interfacecocept{
    @Override
    public void add(int a, int b) {
        System.out.println("The addition of the 2 numbers is :" + (a + b));
    }

    @Override
    public void mult(int e, int f) {
        System.out.println(e*f);
    }

    @Override
    public void subs(int c, int d) {
        System.out.println(c-d);
    }
}
class Main1{
    public static void main(String[] args) {
        Interfacecocept con=new Concept1();
        con.add(2,4);
        con.mult(4,8);
        con.subs(9,5);
    }

}
