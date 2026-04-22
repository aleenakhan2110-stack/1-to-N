import java.util.Scanner;
public class Fixedpassword {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

       while(sc.hasNextInt()){
           int password=sc.nextInt();
           if(password==1999){
               System.out.println("Correct");
               break;
           }
           else{
               System.out.println("Wrong");
           }

       }



    }
}
