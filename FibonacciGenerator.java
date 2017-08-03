package forloop;

public class FibonacciGenerator {
	
	public static void main(String args[])
	{
	int k = 0;
	int j = 1;
	System.out.println(k);
	System.out.println(j);
	system.out.println("hello");
	for(int i =1; i<10; ++i)
	{
		int n = k+j;
		System.out.println(n);
		k=j;
		j=n;
		
	}
	}
}