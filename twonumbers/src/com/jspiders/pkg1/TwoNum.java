package com.jspiders.pkg1;
import java.util.*;

class TwoNum
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc= new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long round = sc.nextLong();
            long check=1;
            long d=b ,c=a;
            while(check<=round){
                if(check%2 ==1)
                    c = c*2;
                else
                    d= d*2;
                check++;
            }
            long intDiv = Math.max(c,d)/Math.min(c,d);
            System.out.println(intDiv);
        }
    }
}

