import java.util.Scanner;


public class TwoSumProblem {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8,9,10};
	System.out.println("enter sum");
	Scanner s=new Scanner(System.in);
	int sum=s.nextInt();
	
	int i=0;
	int j=arr.length-1;
	while(i<j &&  i<arr.length){
	if((arr[i]+arr[j])==sum){
		break;
	}
	else if((arr[i]+arr[j])<sum){
		i++;
	}
	else if((arr[i]+arr[j])>sum){
		j--;
	}
	}
	
	if(sum==(arr[i]+arr[j])){
		System.out.println(arr[i]+"+"+arr[j]);
	}
	}
	
}
