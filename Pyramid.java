import java.util.Scanner;
public class Pyramid {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         if(sc.hasNextInt()) {
             int N = sc.nextInt();
             for (int i = 1; i <= N; i++) {
                 for (int j = 1; j <= i; j++) {
                     System.out.println("*");
                 }
                 System.out.println();
             }
         }


    }
}
