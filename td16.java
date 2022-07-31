//knapsack problem
import java.util.*;
public class td16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        int n=sc.nextInt();
        int[] wt=new int[n];
        int[] pt=new int[n];
        for(int i=0;i<n;i++){
            wt[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            pt[i]=sc.nextInt();
        }
        int[][] arr=new int[n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0||j==0){
                    arr[i][j]=0;
                }
                else if(wt[i-1]>j){
                    arr[i][j]=arr[i-1][j];
                }
                else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i-1][j-wt[i-1]]+pt[i-1]);
                }
            }
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(arr[n][sum]);
    }
}
