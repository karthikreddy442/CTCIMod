import java.util.Scanner;


public class TrailingZeroesNFactorial {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
int count=0;
		for (int i =2;i<=n;i++){
			count+=factorsOf5(i);
		}
		System.out.println(count);
	
	}

	private static int factorsOf5(int i) {
		// TODO Auto-generated method stub
		int count=0;
		while(i%5==0){
			count++;
			i=i/5;
		}
		
		return count;
	}
}
