import java.util.Scanner;
       public class SumOfArray{
         public static void main(String[]args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int intarr[]=new int[n];
            for (int i = 0; i < n; i++) {
                 intarr[i]=sc.nextInt();
              }
              int sum = 0;
              for (int i = 0; i < n; i++) { 
                  sum += intarr[i];
              }
             System.out.println(sum);
              
         

            


       }
}



