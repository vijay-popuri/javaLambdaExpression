package Sets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LaunchStreamsDemo1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many strings you need to enter in the list");
		int n=sc.nextInt();
		List<String> names=new ArrayList<>();
		for(int i=0;i<n;i++) {
			names.add(sc.next());
		}
		System.out.println("Enter the length of String that you need..");
		int m=sc.nextInt();
		List<String> nLength=names.stream().filter(i->i.length()==m).collect(Collectors.toList());
		System.out.println("The List of strings of size "+m+"is ");
		System.out.println(nLength);
		
	
	}

}
