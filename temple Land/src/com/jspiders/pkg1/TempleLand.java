package com.jspiders.pkg1;

import java.util.*;

public class TempleLand {

	public static void main(String[] args)
	{
		
			    @SuppressWarnings("resource")
				Scanner kb=new Scanner(System.in);
			    int s=kb.nextInt();
			    while(s-->0)
			    {
			        int n=kb.nextInt();
			        int a[]=new int[n];
			        for(int i=0;i<n;i++)
			        a[i]=kb.nextInt();
			        int p=0;
			       
			        if(n%2!=0)
			        {
			        for(int i=((n-1)/2);i>0;i--)
			        {
			            if((a[i]-a[i-1])!=1)
			            p=1;
			        }
			        for(int i=((n-1)/2);i<n-1;i++)
			        {
			            if(a[i]-a[i+1]!=1)
			            p=1;
			        }
			            if(a[0]==1)
			            {
			                for(int j=0;j<(n-1)/2;j++)
			                {
			                    if(a[j]!=a[n-j-1])
			                    p=1;
			                }
			            }
			            else
			            p=1;
			        }
			        else
			        p=1;
			        if(p==1)
			        System.out.println("no");
			        else
			        System.out.println("yes");
			    }
	}
}

