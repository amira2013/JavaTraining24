public class ExeptionHandling {
    public static void main(String[] args) {
        int a=12;

      //  System.out.println("The program is running");
try {
    System.out.println(a/0);}

        catch (Exception e){
  //  e.printStackTrace();
            System.out.println(e.getMessage());

            System.out.println("something went wrong");}
System.out.println("The program is not running");
    }}

