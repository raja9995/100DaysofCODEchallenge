 
//                       ## FLOW CONTROL STATEMENTS ##
import java.util.Scanner;
class Day3  
{
	public static void main(String[] args) 
	{

//                      ## DECISIONAL ATATEMENTS ##

		// SIMPLE IF:-

        //ex:1
		  int num=10;
		  if (num>5)
		  {
			  System.out.println("Hello");
			  System.out.println("rajaa");
			  System.out.println("Good Morning");
		  
	      }

		//ex:2

		int a=24;
		if (a%3==0&&8==0)
		{
			System.out.println("divisible");
			a=a+(3*8);
		}
		System.out.println(a);

		char ch='g';
		if (ch>=97&&ch<=122)
		{
			ch-=32;
			System.out.println(ch);
		}

//IF ELSE LADDER or ELSE IF STATEMENT or ELSE IF LADDER:-

		//ex1:-
		
		 Scanner scan1=new Scanner (System.in);  // Using scanner class
		 System.out.println("Enter the Number :");
		 int a1=scan1.nextInt();

		 if (a1>0)
		 {
			 System.out.println("positive");
		 }
         else if (a<0)
         { 
			System.out.println("Negative");
         }
		 else 
		{
			 System.out.println("zero");
		}

		//ex2:-
        
         Scanner sc1=new Scanner (System.in);  // Using scanner class
		 System.out.println("Enter the Character :");
		  char ch1=sc1.next().charAt(0);

		 if (ch>=65&&ch<=90||ch>=97&&ch<=122)
		 {
			
            System.out.println("its a Alphate");

		 }
         else if (ch>=48&&ch<=57)
		 {
			
            System.out.println("its a Digit");

		 }
		 else
		 {
			
            System.out.println("its a Symbol");

		 }

//Nested if:-
         
		 //ex1:-

         Scanner sc=new Scanner (System.in);  // Using scanner class
		 System.out.println("Enter the Character :");
		  char ch2=sc.next().charAt(1);
         
		 if (ch2>=65&&ch<=90||ch2>=97&&ch<=122)
		{
			 if (ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U'||ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u')
			 {
                   System.out.println("its a vowel");

		     }
		    else
		    {
			
               System.out.println("its a Consonant");

		    }
		}
		else 
		{
            System.out.println("not a Alphabate");

		}

		
//SWITCH

        int b=10;
		switch (b)
		{
		case 10:
           
		    System.out.println("Hii");
		
		
		case 20:
           
		    System.out.println("How are you");
		
		case 30:
           
		    System.out.println("where are you");
		
		case 40:
           
		    System.out.println("what doing");

		case 100:
           
		    System.out.println("bye");
		
		case 150:
           
		    System.out.println("see you");
		
		case 50:
           
		    System.out.println("rajaa");
		
		}

		


	}
}
