package pattrens;

import java.util.Scanner;

public class Patt19 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((i+j)%2+" ");
			}
			System.out.println();
		}
		
	}

}
