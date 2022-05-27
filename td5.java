//longest palindromic subarray
import java.util.*;
class td5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		int[][] arr=new int[n][n];
		int maxi=1;
		for(int i=0;i<n;i++)
			arr[i][i]=1;
		for(int i=0;i<n-1;i++){
			if(str.charAt(i)==str.charAt(i+1)){
				arr[i][i+1]=1;
				maxi=2;
			}
			else 
				arr[i][i+1]=0;
		}
		for(int i=2;i<n;i++){
			for(int j=0;j<n-i;j++){
				if(str.charAt(j)==str.charAt(i+j) && arr[j+1][i+j-1]==1)
				{
					arr[j][i+j]=1;
					maxi=Math.max(maxi,i+1);
				}
				else 
					arr[j][i+j]=0;
			}
		}
		System.out.println(maxi);
	}
}