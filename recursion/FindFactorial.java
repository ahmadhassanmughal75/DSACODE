package recursion;
 
class Factorial{
	public double getFactorial(int n) {
		if(n==1) {
			return n;
		}
		else {
			return n*getFactorial(n-1);
		}
	}
}
public class FindFactorial {
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		double f = factorial.getFactorial(7);
		System.out.println("Factorial is :" + f);
	}
}
