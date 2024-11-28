package Abstraction;

abstract class AbstractCon {
   abstract public void m1();
    abstract public void m2();
   abstract public void m3();

}
    class AbsCon1 extends AbstractCon{
      //  public static void main(String[] args) {
            public void m1(){
                System.out.println("m1");
            }
            public void m2(){
                System.out.println("m2");
            }
            public void m3(){
                System.out.println("m3");
            }
        }
        class Main{
            public static void main(String[] args) {

                AbstractCon a=new AbsCon1();
                a.m1();
                a.m2();
                a.m3();
            }
        }




