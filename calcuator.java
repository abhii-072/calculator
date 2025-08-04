package java_internship;

import java.util.Scanner;

public class calcuator {

	public static double add(double a, double b){
		return a+b;
		
	}
	public static double sub(double a, double b) {
		return a-b;
	}
	public static double multipy(double a, double b) {
		return a*b;
	}
	public static double div(double a, double b) {
		if(b==0) {
			System.out.println("cannot divide by zero");
			return Double.NaN;
		}
		return a/b;
	}
	
	 public static void main(String[] args) {
		 Scanner s =new Scanner(System.in);
		 
		 while(true) {
		 System.out.println("=====Abhay's calculator=====");
		 
		 System.out.println("enter first number: ");
		 double a= s.nextDouble();
		 System.out.println("enter second number: ");
		 double b=s.nextDouble();
		 System.out.println("enter opertation: (1 /add, 2 /sub, 3 /multiply, 4 /div): ");
		 char ch=s.next().charAt(0);
		 double result=0;

         switch(ch) {
         case '1':
        	 result=add(a,b);
        	 break;
         case '2':
        	 result=sub(a,b);
        	 break;
         case '3':
        	 result=multipy(a,b);
        	 break;
         case '4':
        	 result=div(a,b);
        	 break;
        	 default:
        		 System.out.println("invalid operation: ");
                   continue;
         }
		 System.out.println("ans=  " +result);
		 
		 System.out.println("do you want to perform another operation? (yes/no) :");
		      String choice =s.next();
		      
		      if(!choice.equalsIgnoreCase("yes")) {
		    	  System.out.println("thank you for using Abhay's calculator!");
		    	  break;
		      }

		 }
		 s.close();
		 
	 }
	 
	   
}


