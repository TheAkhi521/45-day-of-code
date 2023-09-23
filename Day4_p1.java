/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Day4_p1
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner sc = new Scanner(System.in);
		int x,y;
	    int	t=0;
	    t=sc.nextInt();
		while(t>0)
		{
		   x = sc.nextInt();
		   y = sc.nextInt();
		   if(x>=y)
		   {
		       System.out.println(y*1);
		   }
		   else{
		       System.out.println( x*1 + 2*(y-x) );
		   }
	       t--;     
	    }
		    
		}
	}

