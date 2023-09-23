
import java.util.*;
import java.lang.*;
import java.io.*;
class Day4_p2
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = 0 ;
		t = sc.nextInt();
		while(t>0)
		{
		int L = sc.nextInt();
		int V1 = sc.nextInt();
		int V2 = sc.nextInt();
		
		int tt = (int)Math.ceil((double)L/V1);
		int ht = (int)Math.ceil((double)L/V2);
		
		int td = tt-ht;
		if(td>=0)
		{
		   System.out.println(td-1);
		}
		else
		System.out.println("-1");
        	t--;

	}
	}
}
