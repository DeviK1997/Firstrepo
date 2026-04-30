package exceptionexample;

public class Exception {
 
	public static void main(String[] args) {
		try{int n1=50;
		int n2 =0;
		int result = n1/n2;
		System.out.println("Result is"+result); 
	}// Arithmetic
		
		catch(ArithmeticException ae){
			System.out.println("Exception Handling");
		}
		
		finally {
			System.out.println("Important code will be executed");
		}
		//System.out.println("Hello");
		try{int arr[] = {1,2,3,4};
		// TODO Auto-generated method stub    //ArrayIndex
System.out.println(arr[5]);
}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("ArrayIndex Exception Handling");
		}
		
		
		/*String n=null;
		System.out.println(n.length()); // NullPointer*/
		
		
		
	}

}
