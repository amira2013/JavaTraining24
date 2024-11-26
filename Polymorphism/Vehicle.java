package Polymorphism;

public class Vehicle {
    public void add(int x,int y){
        int z=x+y;
        System.out.println("Addind parent "+z);
    }
}
class Car extends Vehicle{
    @Override

    public void add(int x, int y) {
        int z=x+y;
        System.out.println("addind child "+z);
        super.add(x, y);
    }}
    class Main{
        public static void main(String[] args) {
            Car c=new Car();
            c.add(4,8);
            Vehicle v=new Car();
            v.add(5,8);
        }
    }

