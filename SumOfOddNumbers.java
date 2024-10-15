package Sets;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfOddNumbers
{

	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList<>();
		list.add(34);
		list.add(23);
		list.add(1);
		list.add(3);
		list.add(5);
		int  sm=list.stream().filter(i->i%2==1).mapToInt(Integer::intValue).sum();
		System.out.println("the sum of odd elements in the list is "+sm);
		

	}

}
