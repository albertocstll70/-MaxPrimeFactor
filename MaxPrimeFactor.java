package maxprimefactor;

import java.util.ArrayList;

public class MaxPrimeFactor {

	/*
	 * the prime factors of 13195 are 5, 7, 13 and 29.
	 * 
	 * What is the largest prime factor of the number 600851475143 ?
	 */

	public static void main(String[] args) {
	long number = 600851475143L;
	boolean found = false;
		int i = 2;
		
	
		
		
		
		while(!found ) {
			
			
			if(prime(i) && number%i==0  ) {
			    
				
				
				
				number = number / i;
				if(prime(number)) {
						found =true;
						
					}
					
					
					
				
				
				}
				
			if(number == 1  ) {
				found = true;
				
			}
			i++;
		} 
		
		
		System.out.println(number);
	
	
	}

	public static boolean prime(long number) {
		boolean result = true;
		boolean leave = false;
		int i = 1;
		int aux = 2;
		 if(number==2) {
			result = true; 
		 } else if  (number % 2 != 0 && number > 2) {

			while (!leave && i <= number) {
				if (number % i == 0) {
					aux--;
				}

				if (aux < 0) {
					leave = true;
					result = false;
				}
				i++;
			}
		} else {
			result = false;
		}

		return result;
	}

}
