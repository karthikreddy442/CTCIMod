import java.util.Scanner;


public class AlternateList {

	public static void main(String[] args) {
		System.out.println("enter size of array");
	Scanner s=new Scanner(System.in);
	int n=	s.nextInt();
	
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
			System.out.println("enter element "+(i+1));	
			arr[i]=s.nextInt();
			}
			int temp=0;
			for(int i=0;i<arr.length-1;i++){
				if(i%2==0 && arr[i]>arr[i+1]){
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}else if(i%2==1 && arr[i]<arr[i+1]){
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			
			System.out.println("new order is");
			for(int i=0;i<arr.length;i++){
				System.out.println(arr[i]);
			}
			
	}
	
}
