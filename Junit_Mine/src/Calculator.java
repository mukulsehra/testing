
public class Calculator {

		
	private	int input1,input2;
	
		public void setValue(int input1,int input2)
		
		{
			this.input1=input1;
			this.input2=input2;
		}

		public void getSum()
		{
			int sum = input1+input2;
			System.out.println("The sum is : "+sum);
		}
		
		public void getMul()
		{
			int product = input1*input2;
			System.out.println("The product is : "+product);
		}
		
		
		
		
	}


