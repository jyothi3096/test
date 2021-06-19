package com.jspiders.pkg1;
import java.util.*;

class BeautifulArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    if(n==1)
		    {
		        System.out.println("no");
		        break;
		    }
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    Arrays.sort(a);
		    int m=a[n-1]*a[n-2];
		    if(m==a[n-1]||m==a[n-2])
		        System.out.println("yes");
		    else
		        System.out.println("no");
		}
	}
}

