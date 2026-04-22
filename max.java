import java.util.Scanner;
public class max {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int N=sc.nextInt();
         int i=0;
          int max=0;
         while(i<N){
             int num=sc.nextInt();
             if(num>max){
                 max=num;
             }
             i++;

         }
         System.out.println(max);


    }
}
