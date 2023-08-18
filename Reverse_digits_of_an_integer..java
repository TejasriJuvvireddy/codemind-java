import java.util.Scanner;
       public class reverse {
         public static void main(String[]args) {
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();       
            int remainder;
            int reverse=0;
            while(n!=0){
                remainder = n%10;
                reverse = reverse*10+remainder;
                n/=10;
            }
             System.out.printf("%d",reverse);


       }
}



