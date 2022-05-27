//longest chain length for the pairs
//each pair contains the start time and end time
//start time is always less than the end time
//compare the start time of i with end time of i-1 pair and find the longest chain
import java.util.*;
class td4{
	public static void main(String[] args0){
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> arr=new ArrayList<>();//multi-dimensional arraylist
		int n=sc.nextInt();
		for(int i=0;i<2;i++){
			arr.add(new ArrayList());//first array contains all the start times 
			//second array contains all the end times
			for(int j=0;j<n;j++){
				int x=sc.nextInt();
				arr.get(i).add(x);
			}
		}
		ArrayList<Integer> a=new ArrayList<>(n);//extra array
		for(int i=0;i<n;i++){
			a.add(1);//all elements of array initialized with 1 
			//i.e 5 4 3 2 1 each element is a subsequence itself
		}
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(arr.get(0).get(i)>arr.get(1).get(j) && a.get(i)<=a.get(j)){
					a.add(i,a.get(j)+1);
				}
			}
		}
		System.out.println(Collections.max(a));
	}
}