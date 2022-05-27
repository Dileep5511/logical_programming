//jump game
//sub problem for min jumps to reach the end
//valley peak approach
//to find minimum steps to reach the end of array
import java.util.*;
class td6{
	public static void main(String[] args0){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		int n=sc.nextInt();
		int i;
		for(i=0;i<n;i++)
		{
			arr.add(sc.nextInt());
		}
		int r=0,c=0;
		int max_reach=0;
		for(i=0;i<n;i++){
			max_reach=i+arr.get(i);
			if(i>r)
				break;
			if(max_reach>r)
			{
				r=max_reach;
				c++;
			}
		}
		if(i>r)
			System.out.println("-1");
		else 
			System.out.println(c-1 );
	}
}