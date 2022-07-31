//longest common subsequence in the both the strings
//dynamic programming

import java.util.*;
class td12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		int[][] arr=new int[arr1.length+1][arr2.length+1];
		for(int i=0;i<=arr1.length;i++){
			arr[i][0]=0;
		}
		for(int i=1;i<=arr2.length;i++){
			arr[0][i]=0;
		}
		for(int i=1;i<=arr1.length;i++){
			for(int j=1;j<=arr2.length;j++){
				if(arr1[i-1]==arr2[j-1]){
					arr[i][j]=arr[i-1][j-1]+1;
				}
				else{
					arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
				}
			}
		}
		System.out.println(arr[arr1.length][arr2.length]);
		int x=arr1.length,y=arr2.length;
		String str="";
		while(x>0&&y>0){
			int x1=arr[x-1][y];
			int x2=arr[x][y-1];
			int x3=arr[x-1][y-1];
			if(x1>=x2 && x1>x3){
				x=x-1;
			}
			else if(x2>=x1 && x2>x3){
				y=y-1;
			}
			else{
				if(arr[x-1][y-1]<arr[x][y])
				{
					str=String.valueOf(arr1[x-1])+str;
				}
				x=x-1;
				y=y-1;
			}
		}
		System.out.println(str);
	}
}