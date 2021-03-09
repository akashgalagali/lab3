package l3;
import java.util.*;
public class ReplaceCons {
	 static boolean isVowel(char ch) 
	    { 
	        if (ch != 'a' && ch != 'e' && ch != 'i'
	                && ch != 'o' && ch != 'u')  
	        { 
	            return false; 
	        } 
	        return true; 
	    } 
	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		 char[] s = new char[str.length()]; 
		  
	        
	        for (int i = 0; i < str.length(); i++) { 
	            s[i] = str.charAt(i); 
	        } 
		
		for (int i = 0; i < s.length; i++) 
        { 
            if (!isVowel(s[i])) 
            { 
  
                if (s[i] == 'z')  
                { 
                    s[i] = 'b'; 
                } 
                  
                else
                { 
   
                    s[i] = (char) (s[i] + 1); 
   
                    if (isVowel((char)s[i]))  
                    { 
                        s[i] = (char) (s[i] + 1); 
                    } 
                } 
            } 
        } 
        String res="";
        for(int i=0;i<str.length();i++)
        		res=res+s[i];
		System.out.println("String after Consonent Replaced\n"+res);
	}

}
