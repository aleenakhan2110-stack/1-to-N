import java.util.Scanner;
public class evenoddpositivenegative {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int N=sc.nextInt();
         int i=0;
         int Even=0;
         int Odd=0;
         int Positive=0;
         int Negative=0;
         while(i<N){
             int num=sc.nextInt();
             if(num%2==0){

                 Even++;
             }
             else {

                 Odd++;
             }
              if(num>0){

                 Positive++;
             }
             else if(num<0){
                 Negative++;

             }
             i++;

         }
         System.out.println("Even"+Even);
         System.out.println("Odd"+Odd);
         System.out.println("Positive"+Positive);
         System.out.println("Negative"+Negative);
    }
}
