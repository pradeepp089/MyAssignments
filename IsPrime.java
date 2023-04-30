package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		
		int num=30;
		boolean flag= true;
		if(num>1)
		{
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					System.out.println("the given number is not prime");
					flag =false;
				}
			}
			if (flag==true)
			{
				System.out.println("the given number is prime");
				}
			}
			
				
		
			
		}
	
		

	}


