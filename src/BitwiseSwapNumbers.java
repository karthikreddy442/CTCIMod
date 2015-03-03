import java.util.Scanner;


public class BitwiseSwapNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
int b=s.nextInt();

System.out.println(a + " & " + b);
	
	
a=a^b;
b=a^b;
a=a^b;

System.out.println(a + " & " + b);

	
	}
	
	
}
