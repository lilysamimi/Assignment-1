// SI 543 Assignment 1 by Lily Samimi

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
		// shorthand: currentNumber -= d;
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
	
	//alternative to power function
	public void power(double d){
		double base = currentNumber;
		for(int i= 0; i < d-1; i++){
			currentNumber = currentNumber * base;
		}
	}
	
	public double getCurrentNumber() {
		return currentNumber;
	}

	//////////////////////////////////////////////////
	// EXTRA FUNCTIONS - not needed for full credit //
	
	// isEven()
	// returns true is current number is even, false otherwise
	public boolean isEven(){
		if(currentNumber % 2 == 0){
			return true;
		}
		else return false;
	}
	
	// isPrime()
	// returns true if current number is a prime number, false otherwise
	public boolean isPrime(){
		
		for (int i=2; i < currentNumber ;i++) {
	        if (currentNumber % i == 0){
	        	  return false;
	        }
	    }
	    return true;
	}
	
	////////////////////////////////////////////////////
	
}
