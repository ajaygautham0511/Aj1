package basicsajay;
import java.lang.String;
import java.util.Scanner;
public class sample1 {
	public static void main(String[]args)
	{
		System.out.println("Hello World");
		try (Scanner ob = new Scanner(System.in)) {
			String name=ob.nextLine();
			System.out.println("Name is:"+name);
		}
		
	}

}
