import java.util.Scanner;
public class prime1ton {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the value of N");
         if (sc.hasNextInt()) {
             int N = sc.nextInt();
             for (int i = 2; i < N; i++) {
                 if (isPrime(i)) {
                     System.out.println(i);
                 }

             }

         }

     }
     public static boolean isPrime(int num){
         if(num<2) return false;
         for(int i=2;i*i<=num;i++){
             if(num%i==0){
                 return false;
             }
         }
         return true;
     }



}
