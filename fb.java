
import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		int a=0,b=1,c = 0,i,n,d;
		
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println("The fibo is "  +c);
		}
		
	

	}

}
