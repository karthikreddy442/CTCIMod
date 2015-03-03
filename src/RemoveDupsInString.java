import java.util.HashSet;
import java.util.Scanner;


public class RemoveDupsInString {

	public static void main(String[] args) {
		System.out.println("Enter input string");
		
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();

		String op="";
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<input.length()-1;i++){
		if(!hs.contains(input.charAt(i))){
			hs.add(input.charAt(i));
			op+=input.charAt(i);
			
		}
		}
		
		System.out.println("Op string is "+op);
		
	}
	
}
