package fibo;


import java.util.Scanner;

public class FiboSeries {
	/**
	 * @param n
	 */
	public static void fibo(int n)
	{
		int a=0,b=1,c=0,cnt=0;
		System.out.print("Fibonacci Series till "+n+" : ");
		while(cnt<n)
		{
			
			System.out.print(a+"\t");
			c=a+b;
			a=b;
			b=c;
			cnt++;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number to fibo series : "); 
		int n=sc.nextInt();
		fibo(n);

	}

}
