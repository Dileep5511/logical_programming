//longest increaing subsequence/subset
//ex: 2 8 3 5 9 : o/p is 4
import java.util.*;
class td3{
	public static void main(String[] args0){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		while(true){
			int x=sc.nextInt();
			if(x==-1)
				break;
			else 
				arr.add(x);
		}
		int s=arr.size();
		ArrayList<Integer> a=new ArrayList<>(s);//extra array
		for(int i=0;i<s;i++){
			a.add(1);//all elements of array initialized with 1 
			//i.e 5 4 3 2 1 each element is a subsequence itself
		}
		for(int i=1;i<s;i++){
			for(int j=0;j<i;j++){
				if(arr.get(i)>arr.get(j) && a.get(i)<=a.get(j)){
					a.add(i,a.get(j)+1);
				}
			}
		}
		System.out.println(Collections.max(a));
	}
}