//longesst palindromic subsequence  
class Solution {
    public int longestPalindromeSubseq(String s) {
        int l=s.length();
        int[][] arr=new int[l][l];
        for(int i=0;i<l;i++){
            arr[i][i]=1;
        }
        for(int i=0;i<l-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                arr[i][i+1]=1+Math.max(arr[i][i],arr[i+1][i+1]);
            }
            else{
                arr[i][i+1]=Math.max(arr[i][i],arr[i+1][i+1]);
            }
        }
        for(int i=2;i<l;i++){
            for(int j=0;j<l-i;j++){
                if(s.charAt(j)==s.charAt(i+j)){
                    arr[j][i+j]=2+arr[j+1][i+j-1];
                }
                else{
                    arr[j][j+i]=Math.max(arr[j][j+i-1],arr[j+1][i+j]);
                }
            }
        }
        return arr[0][l-1];
    }
}