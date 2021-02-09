package strings;

public class FirstUC {

	public static void main(String[] args) {
		String s="iam in Bangalore";
		String arr[]=s.split("\\s");
		 for(String s1:arr)
		 {
			 String first= s1.substring(0, 1).toUpperCase();
			 String remaining=s1.substring(1);
			 System.out.println(first+remaining+ " ");
		 }

	}

}
