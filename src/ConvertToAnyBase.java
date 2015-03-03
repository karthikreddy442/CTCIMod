import java.util.Scanner;


public class ConvertToAnyBase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=s.nextInt();
		System.out.println("Enter the base of number");
		int b1=s.nextInt();
		System.out.println("Enter desired base of number");
		int b2=s.nextInt();
		
		int preConvert= convertNumberToDecimal(n,b1);
		System.out.println(preConvert+" in decimal");
		int converted=convertNumberFromDecimalToBase(preConvert,b2);
		System.out.println(converted +" in base "+ b2);
		
		
	}

	private static int convertNumberToDecimal(int n, int b1) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int pow=0;
		int num=0;
		while(n!=0){
		num=n%10;	
		sum+=num*Math.pow(b1, pow);
		n=n/10;
		pow++;	
		}
		
		return sum;
	}

	private static int convertNumberFromDecimalToBase(int n, int b) {
		// TODO Auto-generated method stub
		
		
		String sb=new String("");
		int rem=0;
		while(n!=0){
			rem=n%b;
			sb=rem+sb;
			
		n=n/b;	
		}
		
		return Integer.parseInt(sb);
	}
	
}
