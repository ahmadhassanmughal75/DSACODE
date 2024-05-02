package recursion;

public class Sum {
	public static int printSum(int n) {
		int sum=0;
		if(n==0) {
			return sum;
		}
		sum+=n;
		printSum(n-1);
		return sum;
	}
public static void main(String[] args) {
	System.out.println("Sum is :" +	printSum(5));
}
}
