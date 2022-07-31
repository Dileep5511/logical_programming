//alternating string
class Solution {
    public int minSwaps(String s) {
        int len=s.length();
        char[] c=s.toCharArray();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=Integer.valueOf(String.valueOf(c[i]));
        }
        int count=0;
        int ones=0,zeros=0;
        for(int i=0;i<len;i++){
            if(arr[i]==1){
                ones++;
            }
            else{
                zeros++;
            }
        }
        int c1=0,c2=0;
        if(ones-zeros>=2||zeros-ones>=2){
            count=-1;
        }
        else{
            for(int i=0;i<len;i++){
                if(i%2==0){
                    if(arr[i]!=1){
                        c1++;
                    }
                    else{
                        c2++;
                    }
                }
                else{
                    if(arr[i]!=0){
                        c1++;
                    }
                    else{
                        c2++;
                    }
                }
            }
            
            count=Math.min(c1,c2);
            if(count%2==0){
                count=count/2;
            }
            else{
                count=(count+1)/2;
            }
        }
        return count;
    }
}