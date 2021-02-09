package strings;

public class CountChar
{
	public static void main(String[] args) 
	{
		String s="hello iam in bangalore";
		s=s.trim();
		int count=0;
		int wordcount=1;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{
				count++;
			}
			if(ch==' ')
			{
				wordcount++;
			}
		}
		System.out.println("Number of characters: "+count);
		System.out.println("Number of words: "+wordcount);
	}
}
