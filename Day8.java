
//                             ** PRACTICE JAVA PROGRAMS **
//Ex :1

class Day8 
{
	public static void main(String[] args) 
	{
		int num1=1233221;
		int n1=num1;
		int count1=0;
		while (num1!=0)
		{ 
			int r=num1%10;
			if (r==2)
			{
				count1++;
			}
			num1=num1/10;
		}
		System.out.println("the given number is "+n1+  " and No of 2's are:"+count1);

		//Ex:-2

		String str="Raja@123";
		int countAlpha=0;
		int countDigit=0;
		int countSymbol=0;
		int count1Symbol=0;
		int count2Symbol=0;

        int num=str.length();
		
		for (int i=0;i<num;i++)
		{
			char ch=str.charAt(i);
			if (ch>=65&&ch<=90||ch>=97&&ch<=122)
			{
				countAlpha++;
			}
            
			if (ch>=48&&ch<=57)
			{
				countDigit++;
			}
			
			else if (!(ch>=65&&ch<=90||ch>=97&&ch<=122))
			{
                countSymbol++;
			}
				
		}
		System.out.println("count of Alphabates: "+countAlpha);
		System.out.println("count of Digits: "+countDigit);
		System.out.println("count of Symbols: "+countSymbol);
		
		//Ex :3

		for (int a=1;a<=20 ;a++ )
		{
			if (a%3==0&&a%5==0)
			{
				System.out.println("fizzBuzz"+a);
			}
			else if (a%3==0)
			{
				System.out.println("Buzz"+a);
			}
			else if (a%5==0)
			{
				System.out.println("fizz"+a);
			}
		}

		// EX: 4

		  int a=10;
	      if(a>2)
	      { 
		    System.out.println("Hello");
            System.out.println("Good Morning");
	      }
         // EX:5

          int num4=34;
	      if (num4>=30&&num4<=40)
	      {
	        num4=num4+20;	 
          }
          System.out.println(num4);

        //EX:5

	    int b=24;
	    if((b>10&&b<50)&&(b%4==0))
	    {
		 b=b*b;
	    }
	     System.out.println(b);
	
	}
}
