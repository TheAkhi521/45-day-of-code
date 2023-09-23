/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Day6_p2
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner sc = new Scanner(System.in);
	    int	t=0;
	    t=sc.nextInt();
		while(t>0)
		{
		    int d = sc.nextInt();
		    boolean flag = false;
		    String n = sc.next();
		    for(int i = 0;i<n.length();i++)
		    {
		        if(n.charAt(i) == '0' || n.charAt(i) == '5')
		        {
		            flag = true;
		            break;
		        }
		    }
		    if(flag)
		    {
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		    t--;     
    	}
		    
		}
	}

