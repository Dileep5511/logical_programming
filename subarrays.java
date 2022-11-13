//o(n^3)
/*import java.util.*;
public class Main{
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int len = 0; len <= arr.length; len++) {
            if (len == 0) {
                result.add(new ArrayList<>());
            } else {
                for (int i = 0; i < arr.length - len + 1; i++) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    for (int j = i; j < i + len; j++) {
                        temp.add(arr[j]);
                    }
                    result.add(temp);
                }
            }
        }

        result.forEach(System.out::println);
    }
}*/

//o(n^2)
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer> l;
        for(int i=0;i<n;i++){
            l=new ArrayList<>();
            for(int j=i;j<n;j++){
                l.add(a[j]);
                list.add(new ArrayList<>(l));
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
