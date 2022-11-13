
import java.util.*;
public class Main
{
    public static ArrayList<ArrayList<Integer>> func(int n,int[] a){
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> l;
        for(int i=0;i<n;i++){
            int k=arr.size();
            for(int j=0;j<k;j++){
                l=new ArrayList<Integer>(arr.get(j));
                l.add(a[i]);
                arr.add(l);
            }
            l=new ArrayList<Integer>();
            l.add(a[i]);
            arr.add(l);
        }
        return arr;
    }
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
	     a[i]=sc.nextInt();
	}
	ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	list=func(n,a);
	/* sorting based on size()
	Collections.sort(list, new Comparator<ArrayList<Integer>>() {    
              public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                   return Integer.compare(o1.size(),o2.size());
              }               
         });*/
	    /* sorting based on first element
	Collections.sort(list, new Comparator<ArrayList<Integer>>() {    
              public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                   return o1.get(0).compareTo(o2.get(0));
              }               
         });*/
	for(int i=0;i<list.size();i++){
	      System.out.println(list.get(i));
	}
   }
}
