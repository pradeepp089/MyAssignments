package week1.day1;

public class Fibinocci {

	public static void main(String[] args) {
		int n=0, firstnum=1, secondnum=11;
		System.out.println(n+" "+firstnum);
		for(int i=2; i<=secondnum; ++i)
		{
			int sum= n + firstnum;
			n=firstnum;
			firstnum=sum;
				
					System.out.println("The fibonacci series for first 11 numbers is " +sum);
		}
	}

}
