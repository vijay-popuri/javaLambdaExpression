package LambdaExpressions;

interface StringUlta{
	void ReverseTheString(String s);
}
public class StringReverse {

	public static void main(String[] args)
	{
		StringUlta su=(str)->{
			String v="";
			char ar[]=str.toCharArray();
			for(char a:ar) {
				v=a+v;;
			}
			System.out.println("the Reversed String is "+v);
		};
		su.ReverseTheString("vijay");
	

	}

}
