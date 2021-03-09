package l3;
import java.util.*;
public class PositiveString {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] s=str.toCharArray();
		Arrays.sort(s);
		String res="";
		for (int i = 0; i < s.length; i++) {
			res=res+s[i];
		}
		
		if(res.equals(str))
			System.out.println("Positive String");
		else
			System.out.println("Not a Positive String");
	}

}
