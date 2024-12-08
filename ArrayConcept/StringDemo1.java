package ArrayConcept;

public class StringDemo1 {
    public static void main(String[] args) {
        String name="Testing";
        System.out.println(name.length());
        try {
            System.out.println(name.charAt(9));
        }catch (Exception e){
            System.out.println("out of b");
        };

        String a=new String("javaLearning");
        System.out.println(a.charAt(2));
      /*  for (int i=0;i<a.length();i++){
            System.out.print(name.charAt(i)+" ");

        }*/
        System.out.println(name.substring(3));
    }
}
