/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Day7_p2
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner sc = new Scanner(System.in);
		int a,b,c;
	    int	t=0;
	    t=sc.nextInt();
		while(t>0)
		{
		    a = sc.nextInt();
		    b = sc.nextInt();
		    c = sc.nextInt();
		    
		    if(a+c>b)
		    {
		        System.out.println(a+c);
		    }else
		    {
		        System.out.println(b);
		    }
	   
	        t--;     
	    }
		    
		}
	}

