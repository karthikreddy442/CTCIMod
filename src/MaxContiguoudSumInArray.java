import java.util.Scanner;


public class MaxContiguoudSumInArray {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=s.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter element "+ (i+1));
			arr[i]=s.nextInt();
		}
		
		
		int maxSum=0;
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(maxSum<sum){
				maxSum=sum;
			}
			if(sum<0){
				sum=0;
			}
		}		
		
		System.out.println("max sum is " +maxSum);
	}
}
