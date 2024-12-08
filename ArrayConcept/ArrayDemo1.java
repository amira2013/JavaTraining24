package ArrayConcept;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int sum=0;
        int[]numbers=new int[10];

        numbers[0]=1;
        numbers[1]=3;
        numbers[2]=5;
        numbers[3]=7;
        numbers[4]=9;
        numbers[5]=11;
        numbers[6]=13;
        numbers[7]=15;
        numbers[8]=17;
       numbers[9]=19;
        System.out.println(numbers[4]);
        for (int n:numbers){
            sum=sum+n;

           // System.out.print(n+" ");
        }
        System.out.println(sum);
    }
}
