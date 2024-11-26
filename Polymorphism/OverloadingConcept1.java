package Polymorphism;
class NewArea{
    public void getArea(double radius){
        System.out.println("Calculating circle area");
        System.out.println(3.14*radius*radius);
    }
    public void getArea(int side){
        System.out.println("Calculating square area");
        System.out.println(side*side);
    }
    public void getArea(int length,int breadth){
        System.out.println("Calculating rectangle area");
        System.out.println(length*breadth);
    }


    public static void main(String[] args) {
        NewArea over=new NewArea();
        over.getArea(3.5);
        over.getArea(5);
        over.getArea(5,6);
    }}


