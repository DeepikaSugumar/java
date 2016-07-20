
public class factorial {

	
	public static void main(String[] args) {
		int i;
		i=Integer.parseInt(args[0]);
		int fact=1;
		if(i==0)
		{
			System.out.println("Factorial is 1");
		}
		else
		{
			do
			{
				fact=fact*i;
				i--;
			}
			while(i>0);
		}
		System.out.println("Factorial is "+fact);

	}

}
