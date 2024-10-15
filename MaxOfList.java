package Sets;

import java.util.ArrayList;
import java.util.List;

public class MaxOfList {

	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList<>();
		list.add(23);
		list.add(231);
		list.add(45);
		list.add(678);
		int a=list.stream().max(Integer::compareTo).get();
		System.out.println("Maximum is "+a);
		

	}

}
