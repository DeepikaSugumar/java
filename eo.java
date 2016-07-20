import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		if(a%2==0){
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}

}
