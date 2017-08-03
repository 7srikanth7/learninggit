package forloop;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Even numbers :");

		for(int i=2; i<21; i++)
		{
			if(i%2 == 0 )
			{
				System.out.print(i);
				if(i< 20)
				System.out.print(",");
			}
		}
		System.out.println("");
		System.out.println("Odd numbers :");
		for(int i=1; i<21; i++)
		{
			if(i%2 != 0 )
			{
				System.out.print(i );
				if(i< 19)
				System.out.print(",");
			}
		}

	}

}
