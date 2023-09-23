/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Day6_p1
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner sc = new Scanner(System.in);
		int l;
	    int	t=0;
	    t=sc.nextInt();
		while(t>0)
		{ 
		  l = sc.nextInt();
		  int cars = (int)Math.ceil((double)l/4);
		  System.out.println(cars);
		  t--;     
	    }
		    
		}
	}

