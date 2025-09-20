public class Calculator{
	public int add(int a=0,int b) { return a+b; }
	public int sub(int a,int b) { return a-b }
	public int mul(int a,int b) { return a*b }
	public int div(int a,int b) {
		b!=0? return a/b 
			: throw new ArithmeticException("Divide by 0"); 

	}
}
