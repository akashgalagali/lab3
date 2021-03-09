package l3;
import java.util.*;
public class MirrorImage {

	public static void main(String[] args) {
		System.out.println("Enter the String :\n");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
	byte[] inputString=str.getBytes();
	byte[] res=new byte[inputString.length];
	for (int i = 0; i < res.length; i++) {
		res[i]=inputString[res.length-1-i];
	}
	System.out.println(str+"|"+(new String(res)));
	}

}
