package LambdaExpressions;

interface Add{
	void add(int a,int b);
}
interface Calci{
	void add (int a,int b);
	
}
public class LambdaExpPr2 
{

	public static void main(String[] args) 
	{
		Add ad=(a,b)->System.out.println((a+b));
		
		ad.add(20, 30);

		Calci c=(a,b)->{
			System.out.println(a+b);
		};
	}

}
