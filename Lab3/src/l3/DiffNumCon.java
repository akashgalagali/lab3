package l3;
import java.util.*;

public class DiffNumCon {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String res="";
		String s=String.valueOf(n);
		int arr[]= new int[s.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[arr.length-1-i]=n%10;
			n=n/10;
		}
		for (int i = 0; i < arr.length-1; i++) {
			res=res+Math.abs(arr[i]-arr[i+1]);
		}
		res=res+arr[arr.length-1];
		System.out.println(Integer.parseInt(res));
	}

}
