//quadraples

import java.util.*;
class Quadraple{
	HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
	public void push(int i,int j){
		if(map.containsKey(i+j)){
			map.put(i+j,map.get(i+j));
		}
		else{
			map.put(i+j,map.put(i,j));
		}
    }
    public void show(){
    	map.forEach((k,v)->{
    		System.out.println(k+" "+v);
    	});
    }
}
class td11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Quadraple quad=new Quadraple();
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				quad.push(i,j);
			}
		}
		quad.show();
	}
}