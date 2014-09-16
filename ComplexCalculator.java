// SI 543 Assignment 2 by Lily Samimi

package calc;

public class ComplexCalculator {

	private double currentNumber;
	
	// constructor
	public ComplexCalculator(double d) {
		currentNumber = d;
	}
	
	// adds d to current number
	public void add(double d) {
		currentNumber = currentNumber + d;
	}
	
	// subtract d to current number
	public void subtract(double d){
		currentNumber = currentNumber - d;
	}
	
	// multiply d to current number
	public void multiply(double d){
		currentNumber = currentNumber * d;
	}
	
	// divides d to current number
	public void divide(double d){
		currentNumber = currentNumber / d;
	}
	
	// sets current number to 0
	public void clear(){
		currentNumber = 0;
	}
	
	// raises current number to the power of a given number
	public void power(int d) {
		currentNumber = Math.pow(currentNumber, d);
	}
	
	public double getCurrentNumber() {
		return currentNumber;
	}

	//////////////////////////////////////////////////
	// EXTRA FUNCTIONS - not needed for full credit //
	
	// isEven()
	// TODO returns true is current number is even, false otherwise
	public boolean isEven(){
		if(currentNumber % 2 == 0){
			return true;
		}
		else return false;
	}
	
	
	// isPrime()
	// TODO returns true if current number is a prime number, false otherwise
	public boolean isPrime(){
		if (currentNumber % 2 == 0){
			return false;
		}
		
		for (int i=3; i*i <= currentNumber ;i += 2) {
	        if (currentNumber % i == 0){
	        	  return false;
	        }
	    }
	    return true;
	}
	
	
	////////////////////////////////////////////////////
	
}
