package Sets;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfElementsInListUsingStreams {

	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println(list);
		double sum=list.stream().collect(Collectors.summingDouble(i->i));
		System.out.println("The sum of the Amount is "+sum);
		
		
		

	}

}
