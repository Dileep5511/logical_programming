//sum of maximum subarray
//using kadanes method
import java.util.*;
class td8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0,max=arr[0],x=0;
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
			if(sum<0){
				sum=0;
				x=i+1;
			}
			if(sum>max){
				max=sum;
			}
		}
		int s=0;
		System.out.println(max);
		for(int i=x;i<n;i++){
			s=s+arr[i];
			System.out.print(arr[i]+" ");
			if(s>=max){
				int y=i+1;
				while(y<n){
					if(arr[y]==0){
						System.out.print(arr[y]+" ");
						y++;
					}
					else{
						break;
					}
				}
				break;
			}
		}
	}
}

