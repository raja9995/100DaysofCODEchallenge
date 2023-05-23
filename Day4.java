class Day4 
{
public static void main(String[] args) 
	{
	//ex:1
		int n=5;
        char ch='a';
		for (int i=1;i<=n ;i++ )
		{  
			
			for (int j=1;j<=n ;j++ )
			{
				if (i+j<=n+1)
				{
					System.out.print(ch+" ");
					
				}
				else
				{
                   System.out.print("  ");
				}
			}
		 System.out.println();
		}

//ex:2

       
		int n1=5;  
	    for (int i=1;i<=n1;i++)
	    {
			for (int j=1;j<=n1;j++)
			{
				 if (j==1||i==1||i==3||(j==5&&i!=4&&i!=5)||(i==3&&j==3)||(i==4&&j==4)||(i==5&&j==5))
				 {
					System.out.print("* ");
				 }
				 else
				 {
                    System.out.print("  ");
				 }
			}
		    	
			    for (int j=1;j<=n;j++)
			    {
				    if (i==3||j==1&&i!=1||i==1&&j!=2&&j!=1&&j!=4&&j!=5||j==5&&i!=1||i==2&&j!=1&&j!=3&&j!=5)
				      {
				       	System.out.print("* ");
				      }
				      else
				      {
				        System.out.print("  ");
				      }
			    
			    }
                
				for (int j=1;j<=n;j++ )
				{
					if (i==1||j==3||(i==5&&j!=4&&j!=5)||(j==1&&i!=2&&i!=3))
					{
                      System.out.print("* ");
					}
					else
				      {
				        System.out.print("  ");
				      }
				}
				for (int j=1;j<=n ;j++ )
				{ 
					if (j==1||j==5||i==1||i==3)
					{
				      System.out.print("* ");
					}
				    else
					{ 
				      System.out.print("  ");
					}
				}
				
				
			System.out.println();
           }				
						
  //ex:3
    int n3=1000;
      int ch1=20;
      
      for(int i=1;i<=n;i++)
      {
         for(int j=1; j<=n3;j++)
		
		  {
			  if (i+j<=n3+1)
			  {
				  System.out.print(ch+ " ");
			  }
            
		  }

         System.out.println();
      }



	}
}
