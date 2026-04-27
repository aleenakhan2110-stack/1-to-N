import java.util.Scanner;
public class shape2 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         if(sc.hasNextInt()){
         int N=sc.nextInt();
         for(int i=1;i<=N;i++){
             for(int j=1;j<=N-i;j++){
                 System.out.println("");
             }
             for(int k=1;k<=2*i-1;k++){
                 System.out.println("*");
             }
             System.out.println();
         }
         }

    }
}
