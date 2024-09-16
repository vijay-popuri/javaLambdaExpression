package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

interface FilterList{
	void filterEven(int a[]);
}
public class FilterEvenNumbers
{

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6,7,8};
		List<Integer> b=new ArrayList<>();
		FilterList fl=(arr)->{
			for(int i=0;i<arr.length;i++) {
				if(a[i]%2==0) {
					b.add(a[i]);
				}
			}	
		};
		fl.filterEven(a);
		for(Integer i:b) {
			System.out.print(i+" ");
		}
		
	}

}
