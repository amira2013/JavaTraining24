public class Inher2 {
    int num=20;
    public void display(){
        System.out.println("This the display of the method super class");
    }
    static class Sub_Class extends Inher2{
        int num=10;
        public void display(){
            System.out.println("This the display of the method of the subclass");
        }

        public void my_method(){
           // Sub_Class sub=new Sub_Class();
            //sub.display();
            super.display();
            //System.out.println(sub.num);
            System.out.println(super.num);
        }

        public static void main(String[] args) {
            Sub_Class obj=new Sub_Class();
            obj.display();
            obj.my_method();
        }
    }}


