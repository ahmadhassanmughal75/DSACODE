package recursion;

public class PrintNumbers {
	public static void print(int n) {
		if (n==0) {
			return;
		}
		System.out.println(n);
		print(n-1);
		return;
	}
public static void main(String[] args) {
	print(10);
}
}
