package module1;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Dell";
		String str2="dell";    //if Dell is given then it becomes true because string is a case sensitive
		System.out.println("using==:"+str1==str2);
		System.out.println("using .equals():"+str1.equals(str2));

	}

}
