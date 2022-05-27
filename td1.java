//number of subarrays sum equal to k
//HashMap data structure is used
//tc-o(n) & sc-o(n)
import java.util.*;
class td1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		int n=sc.nextInt();
		Boolean val=true;
		while(val){
			int x=sc.nextInt();
			if(x==-1)
				val=false;
			else 
				arr.add(x);
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(0,1);
		int sum=0,count=0;
		for(int i=0;i<arr.size();i++){
			sum=sum+arr.get(i);
			if(sum==n)
				count++;
			else if(map.containsKey(sum-n))
				count+=map.get(sum-n);
			if(map.get(sum)!=null)
			     map.put(sum,map.get(sum)+1);
			else 
			 	map.put(sum,1);
		}
		System.out.println(count);
	}
}