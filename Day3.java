import java.util.Scanner;
 class Day3
 {
     public static void main(String []args)
     {
         Scanner sc =  new Scanner(System.in);
         int t,x,y;
         t = sc.nextInt();
         while(t>0)
         {
             x = sc.nextInt();
             y = sc.nextInt();
             if(x>y)
             {
                 System.out.println(x-y);
             }else{
                 System.out.println(0);
             }
             t--;
         }
     }
 }