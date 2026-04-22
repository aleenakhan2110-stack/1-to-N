import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=0;
        while(i<=12){
            System.out.println(N+ "*" + i + "=" + (N*i));
            i++;
        }


    }
}
