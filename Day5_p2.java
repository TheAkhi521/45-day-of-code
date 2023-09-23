/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Day5_p2
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner sc = new Scanner(System.in);
		int l;
	    int	t=0;
	    t=sc.nextInt();
		while(t>0)
		{
		   int n = sc.nextInt();
		  //   int y = 0;
		  //   int f = n;
		  //   for(int i =1; i<=n;i++)
		  //   {
		  //       y += 1;
		  //       if(y>=f)
		  //       {
		  //           break;
		  //       }
		  //       f -= 1;
		  //       if(y>=f)
		  //       {
		  //           break;
		  //       }
		  //   }
		  
		 //... optimised solution
		     System.out.println((n+1)/2);
		
	       t--;     
	    }
		    
		}
	}

