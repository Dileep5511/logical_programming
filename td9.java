//minimum swaps required to sort an array
import java.util.*;
import java.io.*;
class td9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		// int[] arr=new int[n];
		// int[] ar=new int[n];
		int[] a=new int[n];
		// for(int i=0;i<n;i++){
		// 	arr[i]=sc.nextInt();
		// }
		// for(int i=0;i<n;i++){
		// 	ar[i]=sc.nextInt();
		// }
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		//brute force sort
		// int count1=0,count2=0;
		// for(int i=0;i<n-1;i++){
		// 	for(int j=i+1;j<n;j++){
		// 		if(arr[i]>arr[j]){
		// 			int temp=arr[i];
		// 			arr[i]=arr[j];
		// 			arr[j]=temp;
		// 			count1++;
		// 		}
		// 	}
		// }

		//selection sort
		// int c1=0;
		// for(int i=0;i<n-1;i++){
		// 	int min=i;
		// 	for(int j=i+1;j<n;j++){
		// 		if(ar[i]>ar[j]){
		// 			min=j;
		// 		}
		// 	}
		// 	if(min!=i){
		// 		int temp=ar[i];
		// 		ar[i]=ar[min];
		// 		ar[min]=temp;
		// 		c1++;
		// 	}
		// }

		//consecutive distinct elements sort 1 to n
		int c2=0;
		boolean b[]=new boolean[n];
		// for(int i=0;i<n;i++){
		// 	System.out.println(b[i]);
		// }
		for(int i=0;i<n;i++){
			int node;
			if(b[i]==false){
				b[i]=true;
				if(i+1==a[i]){
					continue;
				}
				else{
					int x=a[i]-1;
					while(b[x]==false){
						b[x]=true;
						node=a[x]-1;
						x=node;
						c2++;
					}
				}
			}
		}
		// System.out.println(count1);
		// System.out.println(c1);
		System.out.println(c2);
	}
}