package strings;

public class Vowels {

	public static void main(String[] args) {
		String st="apple";
		int count=0;
		int count1=0;
		String V="";
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch=='a' | ch=='e' | ch=='i' | ch =='o' | ch=='u')
			{
				++count;
				V=V+ch;
			}
			else
			{
				count1++;
			}
		}
		System.out.println("Vowels "+count +" are "+V);
		System.out.println("Consonants "+count1);
	}

}
