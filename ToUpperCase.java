package strings;

public class ToUpperCase 
{
	public static void main(String[] args) 
	{
		String st="hello iam in bangalore";
		String first=st.substring(0,1).toUpperCase()+st.substring(1,6);
		String second=st.substring(6,7).toUpperCase()+st.substring(7,10);
		String third=st.substring(10,11).toUpperCase()+st.substring(11,13);
		String fourth=st.substring(13,14).toUpperCase()+st.substring(14);

		System.out.println(first+second+third+fourth);
	}
}
