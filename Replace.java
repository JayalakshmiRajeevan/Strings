package strings;

public class Replace
{
	public static void main(String[] args)
	{
		String s="apple";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			s1=s1+ch;
			s=s.replace(ch, ' ');
		}
			System.out.println(s1);
	}

}
