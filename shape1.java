import java.util.Scanner;
public class shape1 {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       if(sc.hasNextInt()){
           int N=sc.nextInt();
           for(int i=1;i<=N;i++){
               for(int j=1;j<=(N+1-i);j++){
                   System.out.println("*");
               }
               System.out.println();
           }

       }

    }
}
