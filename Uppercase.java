package strings;

public class Uppercase
{
	public static void main(String[] args) 
	{
		String name="java";
		String first=name.substring(0,1).toUpperCase();
		String next=name.substring(1);
		System.out.println(first+next);
		System.out.println(first.concat(next));
	}

}
