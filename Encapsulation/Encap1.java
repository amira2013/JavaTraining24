package Encapsulation;

public class Encap1 {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
       this.name=name;

    }
}
 class Main{

    public static void main(String[] args) {
        Encap1 e=new Encap1();
        e.setName("Sami");
        System.out.println("the name is : "+e.getName());
    }}
