
public class prime {

	public static void main(String[] args) {
		 int i,a;
	        int prime=0;
	        a=Integer.parseInt(args[0]);
	        System.out.println("Enter an Integer No " +a);
	        if(a==0 || a==1)
	        {
	        	System.out.println("It is neither prime nor composite");
	        }
	        else
	        {
	        	for(i=2;i<=a/2;i++)
	        	{
	        		if(a%i==0)
	        		{
	        			prime=1;
	        			break;
	        		}
	        	}
	        }
	        if(prime==1)
	        {
	        	System.out.println("It is not a prime");
	        }
	        else 
	        {
	        	System.out.println("It is a prime no");
	        }

	}

}
