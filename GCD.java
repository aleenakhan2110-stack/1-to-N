import java.util.Scanner;
public class GCD {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         if(sc.hasNextInt()){
             int A=sc.nextInt();
             int B=sc.nextInt();
             while(B!=0){
                 int temp=B;
                 B=A%B;
                 A=temp;
             }
             System.out.println(A);

         }





    }
}
