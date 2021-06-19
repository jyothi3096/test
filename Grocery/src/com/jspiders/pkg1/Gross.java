package com.jspiders.pkg1;

import java.util.Scanner;

class Gross
{
	public static void main (String[] args) 
	{
		  @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
             int t=sc.nextInt();
        while(t!=0){
            int salary;
            double hra,da;
            salary=sc.nextInt();
            if(salary<1500){
               hra= salary*.1;
               da=salary*.9;
               
                System.out.println(salary+hra+da);
            }   else{
                hra=500;
                da=salary*.98;
               
                System.out.println(salary+hra+da);
            }
            t--;
        }
    }
	
}
