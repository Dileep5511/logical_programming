
import java.util.*;
public class subsequences
{
    public static List<List<Integer>> combinations(int[] arr) {
        List<List<Integer>> c = new ArrayList<List<Integer>>();
        List<Integer> l;
        for (int i = 0; i < arr.length; i++) {
            int k = c.size();
            System.out.println("c size is k:"+k);
            for (int j = 0; j < k; j++) {
                l = new ArrayList<Integer>(c.get(j));
                System.out.println("j arraylist created for l");
                l.add(new Integer(arr[i]));
                System.out.println(arr[i]+" added to l");
                c.add(l);
                System.out.println("l added to c");
            }
            l = new ArrayList<Integer>();
            l.add(new Integer(arr[i]));
            System.out.println(arr[i]+" added to l");
            c.add(l);
            System.out.println("l added to c");
        }
        return c;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		list=combinations(arr);
		for(int i=0;i<list.size();i++){
		    for(int j=0;j<list.get(i).size();j++){
		        System.out.print(list.get(i).get(j)+" ");
		    }
		    System.out.println();
		}
		System.out.println(list.size());
	}
}
