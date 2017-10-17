package java_lambda_Pe7;



import java.util.Scanner;

public class Pe7 {

	public static void main(String[] args) {
		System.out.println("Give two  numbers");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		in.close();
		
		findFactor myLamda=(int x,int y)-> x%y;
		int k=myLamda.checkFactor(a, b);
		if(k==0)
			System.out.println("Yes");
		else
			System.out.println("No");
		
			
	}
}

	
	interface findFactor{
		int checkFactor(int x,int y);
	}