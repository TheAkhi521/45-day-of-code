import java.util.Scanner;
class Day2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        int x,y,z;
        while(t>0)
        {
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            int total = x*5+y*10;
            System.out.println(total/z);
            t--;
        }
        
    }
}