
//                               JAVA OPERATORS:-
class Day2 
{
	public static void main(String[] args) 
	{
	//ARITHMATIC IOPERATOR:

		int a=10;
		int b=10;
		int c=a+b;
		System.out.println(c);

        int a1=10;
		int b1=20;
		int c1=a1-b1;
		System.out.println(c1);

        int a2=8;
		int b2=40;
		int c2=b2*10+a2;
		System.out.println(c2);
          
		int a3=120;
		int b3=100;
		int c3=a3/b3;
		System.out.println(c3);

		int a4=20;
		int b4=100;
		int c4=a4%b4;
		System.out.println(c4);

   //RELATIONAL OPERATOR:

		int num=70;
		boolean res=num>50;
        System.out.println(res);

		int num1=10;
		int num2=25;
		boolean res1=(num1<num2);
		System.out.println(res1);

        int n1=100;
		int n2=215;
		boolean res2=(n1<=n2);
		System.out.println(res2);
        
		int m1=100;
		int m2=215;
		boolean res3=(m1>=m2);
		System.out.println(res3);

		int s1=100;
		int s2=215;
		boolean s3=(s1==s2);
		System.out.println(s3);

		int d1=100;
		int d2=215;
		boolean d3=(d1!=d2);
		System.out.println(d3);

      //LOGICAL OPERATORS:

		int e1=100;
		int e2=200;
		int e3=300;
		boolean e4=(e3>e1)&&(e2>e3);
		System.out.println(e4);

		boolean r=(true||false);
        System.out.println(r);

		char ch='a';
		boolean ch1=!(ch>=65&&ch<=90);
		System.out.println(ch1);


      //ASSIGNMENT OPERATOR:

		int t=10;
		t+=5;
		t+=3;
		System.out.println(t);

        char ch2='g';
		ch2-=32;
        System.out.println(ch2);

        int v=10;
		v/=2;
        System.out.println(v);

		int x=10;
		x%=2;
        System.out.println(x);
  
    //INCREMENTAL OR DECREMENTAL OPERATOR:

	    int z=10;
		z++;
        System.out.println(z);

		int z1=10;
		z1--;
        System.out.println(z1);

		int p=10;
		int q=30;
		int p4=++p + ++q;
        System.out.println(p4);

        int p1=10;
		int q1=30;
		int p2=--p1 - --q1;
        System.out.println(p2);

    //TERNARY OR TERTIARY OPERATORS;

	   int i=2;
       String i1=(0%2==0)?"even":"odd";
       System.out.println(i1);
	}
}
