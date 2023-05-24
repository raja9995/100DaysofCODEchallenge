

//                             JAVA NUMBER PROGRAMS:-

class Day5 
{
	public static void main(String[] args) 
	{

//FIBONACCI SERIES:


		// 0 1 1 2 3 5 8 13

           int term=10;
          int a=0;
          int b=1;
          int c;

          for (int i=1;i<=term;i++)
           {
             System.out.println(a+"  ");

             c=a+b;

             a=b;
             b=c;
            }

// PRIME NUMBER:-

int num=6;
		int	count=0;

		for (int i=1;i<=num;i++)
		{
			if (num%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}

// FACTORIAL NUMBER:

        int num1=5;
		int factorial=1;
		while (num1!=0)
		{
			factorial=factorial*num1;
			num1--;
		}
		System.out.println(factorial);

// NEON NUMBER:-

        for (int i=1;i<=300;i++)
	    {
		    int n=i;
		   int sq=n*n;
		   int sum=0;
		  while (sq!=0)
		   {
			 int last=sq%10;
			 sum=sum+last;
			 sq=sq/10;
		    }
		   if (n==sum)
		   {
			 System.out.println(i);
		    }
	    }	 

// STRONG NUMBER:

        int n1=145;
		int sum=0;
		int n2=n1;
		while (n1!=0)
		{
			int factorial2=1;
			int last=n1%10;
			while (last!=0)
			{
				factorial2=factorial2*last;
				last--;
			}
			sum=sum+factorial2;
			n1=n1/10;
		}
		if (n2==sum)
		{
			System.out.println("stong number");
		}
		else
		{
			System.out.println("not a strong number");
		}

// PERFECT NUMBER:

     	int n3=6;
		int sum1=0;

		for (int i=1;i<n3;i++)
		{
			if (n3%i==0)
			{
				sum1=sum1+i;
			}
		}
		if (n3==sum1)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("not perfect number");
		}

// SPY NUMBER:-

        int num4=6, product=1, sum3=0, lastdigit;
         //executes until the condition becomes false
        while(num4>0) 
        {
            //finds the last digit of the number
            lastdigit=num4%10;
            //adds last digit to the variable sum
            sum3=sum3+lastdigit;
            //calculates the product
            product=product*lastdigit;
            //removes the last digit from the given number
            num4=num4/10;
        }
        //compares the sum and product
        if(sum3==product)
            //prints if the above condition returns true
            System.out.println("The given number is a spy number.");
        else
            //prints if the above condition returns false
            System.out.println("The given number is not a spy number.");

// PALINDROME NUMBER:-

        int num5=121;
		int reverse=0;
		int num6=num5;

		while (num5!=0)
		{
			int last = num5%10;
			reverse = reverse*10+last;
			num5=num5/10;
		}
		System.out.println(reverse);
		if (reverse==num6)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");

// ARMSTRONG NUMBER:-

     int num7=153;
	 int num8=num;
	 int num9=num;
	 int count1=0;
	 int sum4=0;
	 
	 while (num7!=0)
	 {
		count1++;
		num7=num7/10;
	 }
	 while (num8!=0)
	 {
		 int last=num8%10;
		 int res=1;
		 for (int i=1;i<=count1;i++ )
		 {
			 res=res*last;
		 }
			 sum4=sum4+res;
			 num8=num8/10;
	 }
	 if (num5==sum4)
		 System.out.println("ArmStrong Number");
	 else
		 System.out.println("Not a ArmStrong Number");
       }
	}

