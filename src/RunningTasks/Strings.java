package RunningTasks;

public class Strings { 
	
	static String s1 = "Gopi";
	static String s2 = "Gopi";
	
	
	static String s3 = new String("Nani");
	static String s4  = new String("Nani");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(s1==s2);
		System.out.println(s3.equals(s4));

	}

}
