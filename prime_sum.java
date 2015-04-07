// The solution is 142913828922.
public class prime_sum {

	public static void main(String[] args) {
		long sum = 0L;
		int arrayCount = 0;
		int max = 2000000;
		int [] array = new int [max];
		
		for (int i = 2 ; i < max; i++){
			if (primeDivide(i,array,arrayCount)){
				if (i >= 113){ //113 is the greatest prime needed to factor greater values
					sum += i;
					arrayCount++;
					array[arrayCount] = i;
				}
				else if (prime(i)){
					sum += i;
					arrayCount++;
					array[arrayCount] = i;
				}
			}
		}
		System.out.print(sum);
	}

	//primeDivide will store all the determined prime values and use this array to 
	//determine greater prime values by using these primes as denominators
	//Similar concept to the Sieve of Eratosthenes.
	public static boolean primeDivide(int number, int[] array, int z){
		boolean divide = true;
		for (int i = 1 ; i < z; i ++){
			if (number % array[i] == 0){
				divide = false;
				break;
			}
		}
		return divide;
	}
	//The following method will check if the given argument is prime.
	//It will divide the value by all the values less than itself. 
	
	public static boolean prime(int number){
		boolean prime = true;
		for (int i = 2 ; i < number ; i++){
			if (number % i == 0){
				prime = false;
			}	
		}
		return prime;
	}
}
