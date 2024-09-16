package LambdaExpressions;
interface StringLength{
	int GetLengthOfString(String str);
}

public class LambdaExpressionsStringLenggth {

	public static void main(String[] args) 
	{
		StringLength strlen=(a)->a.length();
		int size=strlen.GetLengthOfString("vijay");
		System.out.println("the length of give String is "+size);

	}

}
