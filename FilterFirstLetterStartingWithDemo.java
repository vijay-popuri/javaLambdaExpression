package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

interface FirstLetterStartingDemo{
	void filterWithFirstLetter(String a[]);
}

public class FilterFirstLetterStartingWithDemo {

	public static void main(String[] args) 
	{
		String a[]= {"vijay","anand","amar","anu","ajay","divya"};
		List<String> strList =new ArrayList<>();
		FirstLetterStartingDemo flsd=(arr)->{
			for(String str:arr) {
				if(str.startsWith("a")){
					strList.add(str);
				}
			}
		};
		flsd.filterWithFirstLetter(a);
		for(String filterString:strList) {
			System.out.println(filterString);
		}

		
	}

}
