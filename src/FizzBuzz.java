import java.util.Scanner;

/**
 * 
 */

/**
 * @author c.toy
 *
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1;i <=100;  i++) {
			
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizz Buzz");
			}else if(i % 3 == 0){
				System.out.println("Fizz");
			} else if(i % 5 == 0){
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
			
		}
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
