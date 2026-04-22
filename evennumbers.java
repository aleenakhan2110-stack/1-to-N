import java.util.Scanner;
public class evennumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=2;
        while(i<=N){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }


    }
}
