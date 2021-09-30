//Program to reverse words in a string
import java.util.*;

public class Reversestring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String reversestr = "";
		
		for(int i=(str.length()-1); i>=0;i--) {
			reversestr = reversestr + str.charAt(i);
		}
		  
		System.out.println(reversestr);
	}

}
