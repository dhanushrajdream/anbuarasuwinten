package Example;

public class Example {
	public static void main(String[] args) throws ArithmeticException {
		int age=20;
		if(age<18) {
			throw new ArithmeticException("Access Denied");
		}
		else {
			System.out.println("Granted");
			long startTime = System.currentTimeMillis();  
	      
	        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");
		}
		
			   try {
			      
			      throw new ArithmeticException("Something went wrong!!");
			   } 
			   catch (Exception exp) {
			      System.out.println("Error: "+exp.getMessage());
			   }
			}
	
	}


		
	

