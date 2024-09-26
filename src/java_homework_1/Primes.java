package java_homework_1;

public class Primes {
	public static void main(String[] args){
		int nValues = 50;
		boolean isPrime = true;
		
		testNumbers:
			for(int i = 2; i <= nValues; i++){
				isPrime = true; 
				for (int j = 2; j < Math.floor(i); j++){
					if (i % j == 0){
						continue testNumbers;
					}
				}
				
				System.out.println(i);
			}
	}
}
