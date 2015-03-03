import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class RecursiveWordSegment {

	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		
		if(wordBreak(str)){
			System.out.println(true);
		}
	}
	
	
 private static boolean wordBreak(String str) {
		// TODO Auto-generated method stub
int size=str.length();
if(size==0){
	return true;
}
	
	for(int i=1;i<=size;i++){
	if(dictContains(str.substring(0, i)) && wordBreak(str.substring(i,size))){
		return true;
	}	
		
	}
	
	return false;
}

public static boolean dictContains(String str){
	 String dictionary[] = {"mobile","samsung","sam","sung","man","mango",
             "icecream","and","go","i","like","ice","cream"};
	 HashSet<String> dict=new HashSet<String>(Arrays.asList(dictionary));
	 
return dict.contains(str);

 }
}
