import java.util.Scanner;
        public class  EvenSum{
         public static void main(String[]args) {
            Scanner sc = new Scanner(System.in);
             int n=sc.nextInt();
             int intarr[] = new int[n];
             for (int i = 0; i < n; i++) {
                 intarr[i]=sc.nextInt();
              }
              int sum = 0;
              for (int a:intarr) {
                  if(a%2==0){
                      sum += a;
                  }
             
             }
             System.out.println(sum);
          }
        }




