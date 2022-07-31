// import java.util.*;
// public class td17 {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int m=sc.nextInt();
//         int n=sc.nextInt();
//         int[] arr =new int[m];
//         for(int i=0;i<m;i++){
//             arr[i]=i+1;
//         }
//         String st="";
//         for(int j=0;j<m;j++){
//             st=st+"0";
//         }
//         int res=0;
//         for(int i=0;i<Math.pow(2,m);i++){
//             String s=Integer.toBinaryString(i);
//             if(s.length()!=m){
//                 s=st.substring(0,m-s.length())+s;
//             }
//             ArrayList<Integer> list=new ArrayList<>();
//             for(int j=0;j<s.length();j++){
//                 if(s.charAt(j)=='1'){
//                     list.add(arr[j]);
//                 }
//             }
//             if(list.size()==n){
//                 int status=1;
//                 for(int j=0;j<list.size()-1;j++){
//                     if(list.get(j+1)%list.get(j)!=0){
//                         status=0;
//                     }
//                 }
//                 if(status==1){
//                     res++;
//                 }
//             }
//         }
//         if(n==1){
//             System.out.println(res);
//         }
//         else{
//             System.out.println(res+m);
//         }
//     }
// }








// import java.util.*;
// class td17{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int k=sc.nextInt();
//         System.out.println(count(n,k));
//     }
//     static int counter(int n,int k){
//         int count=0;
//         if(k==1){
//             return n;
//         }
//         else{
//             for(int i=1;i<=n;i++){
//                 for(int j=1;j<=n;j++){
//                     if(j%i==0){
//                         count++;
//                     }
//                 }
//             }
//         }
//         return count;
//     }
//     static int count(int n,int k){
//         if(k==1){
//             return n;
//         }
//         if(k==2){
//             return counter(n,k);
//         }
//         int mid=k/2;
//         int x=count(n,k-mid);
//         int y=count(n,mid);
//         return x+y-1;
//     }
// }




import java.util.*;
class td17{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n-k+1;i++){
            list.add(new ArrayList());
            for(int j=i;j<i+k;j++){
                list.get(i).add(arr[j]);
            }
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n-k+1;i++){
            int sum=0;
            for(int j=0;j<k;j++){
                sum=sum+list.get(i).get(j);
            }
            a.add(sum);
        }
        for(int i=0;i<m;i++){
            int x=Collections.min(a);
            int ind=a.indexOf(x);
            for(int j=0;j<list.get(ind).size();j++){
                list.get(ind).set(j,list.get(ind).get(j)+1);
            }
            a.set(ind,a.get(ind)+k);

        }
        int mi=list.get(0).get(0);
        for(int i=0;i<n-k+1;i++){
            for(int j=0;j<k;j++){
                if(list.get(i).get(j)<mi){
                    mi=list.get(i).get(j);
                }
            }
        }
        System.out.println(mi);
    }
}