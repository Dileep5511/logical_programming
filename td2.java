//gold mine problem
//paths can be taken are right,right up and right down.
import java.util.*;
class td2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int x=0;
		for(int i=m-1;i>0;i--){
			for(int j=0;j<n;j++){
				if(j==0)
				    arr[j][i-1]=arr[j][i-1]+Math.max(arr[j][i],arr[j+1][i]);
				else if(j==n-1)
					arr[j][i-1]=arr[j][i-1]+Math.max(arr[j][i],arr[j-1][i]);
				else {
					x=Math.max(arr[j+1][i],arr[j-1][i]);
				    arr[j][i-1]=arr[j][i-1]+Math.max(x,arr[j][i]);
			    }
			}

		}
		int y=0,z=0;
		for(int i=0;i<n;i++){
			y=Math.max(z,arr[i][0]);
			z=y;
		}
		System.out.println(y);
	}
}
