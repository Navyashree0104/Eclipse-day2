package wiproday2;

import wiprod2.ArrayIndexOutOfBoundException;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());
			
			int[] arr = {1,2,3};
			System.out.println(arr[5]);
		}
		catch (NullPointerException e) {
			System.out.println("Caught NullPointerException: " + e.getMessage());
			
		}
		catch (ArrayIndexOutOfBoundException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		}
		finally {
			System.out.println("Finally block executed: Cleanup operations if needed.");
		}
		
	}

}
