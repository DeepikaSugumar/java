
public class palindrome {

	public static void main(String[] args) {
		int rem,rev=0;
		int a=Integer.parseInt(args[0]);
		int b=a;
		while(a>0)
		{
		rem=a%10;
		rev=rev*10+rem;
		a=a/10;
		}
	
	if(b==rev)
	{
		System.out.println(+b+ " is palindrome");
	}
	else
	{
		System.out.println(+b+ " is not a palindrome");
        
	}

	}

}
