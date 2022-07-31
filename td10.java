import java.util.*;
class td10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i])+1);
			}
			else{
				map.put(arr[i],1);
			}
		}
		Set<Map.Entry<Integer,Integer>> set=map.entrySet();
		List<Map.Entry<Integer,Integer>> list=new ArrayList<>(set);
		Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
			public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2){
				//return o1.getValue().compareTo(o2.getValue());//ascending order of values
				return o2.getValue().compareTo(o1.getValue());//descending order of values
			}
		});
		ArrayList<Integer> a =new ArrayList<>();
		list.forEach(s->{
				a.add(s.getKey());
		});
		for(int i=0;i<k;i++){
			System.out.println(a.get(i));
		}
	}
}




// Set<Map.Entry<Integer,Integer>> set=map.entrySet();
// List<Map.Entry<Integer,Integer>> list=new ArrayList<>(set);
// Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
// 	public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2){
// 	       return o1.getValue().compareTo(o2.getValue());
// 	   }
// });