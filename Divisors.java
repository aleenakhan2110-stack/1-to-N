import java.util.Scanner;
public class Divisors  {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       if(sc.hasNextInt()){
       int N=sc.nextInt();
       for(int i=0;i<=N;i++){
           if(N%i==0){
               System.out.println(i);

           }




       }

       }


    }
}
