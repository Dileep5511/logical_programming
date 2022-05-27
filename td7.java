import java.util.*;
class td7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
			a[i]=sum;
		}
		int status=0;
		if(n==1){
			System.out.println(arr[0]);
			status=1;
		}
		else if(n==2){
			System.out.println("equilibrium point doesn't exist");
			status=1;
		}
		else{
			for(int i=1;i<n-1;i++){
				int val1=sum-a[i];
				int val2=a[i]-arr[i];
				if(val1==val2){
					System.out.println(arr[i]);
					status=1;
					break;
				}
			}
		}
		if(status==0){
			System.out.println("no equilibrium for the given values");
		}
	}
}