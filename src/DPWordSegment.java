import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class DPWordSegment {

	static boolean[] wb;
	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		
		if(wordBreak(str)){
			System.out.println(true);
		
			int prev=0;
			
		for(int i=0;i<wb.length;i++){
//			System.out.print(wb[i]+",");
		if(wb[i]){
		System.out.println(str.substring(prev,i));	
		prev=i;
		}
		
		}
		
		
		
		}
		
		
	}

	private static boolean wordBreak(String str) {
		// TODO Auto-generated method stub

		int size=str.length();
		if(size==0){
			return true;
		}
		wb=new boolean[size+1];
		for(int i=0;i<=size;i++){
			wb[i]=false;
		}
		
		for(int i=1;i<=size;i++)
		{
			if(wb[i]==false && dictContains(str.substring(0, i))){
				wb[i]=true;
			}
			
			if(wb[i]){
				if(i==size){
					return true;
				}
				
				for(int j=i+1;j<=size;j++){
					if(wb[j]==false && dictContains(str.substring(i, j-i))){
						wb[j]=true;
					}
				
					if(j==size && wb[j]==true){
						return true;
					}
				
				}
				
				
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
