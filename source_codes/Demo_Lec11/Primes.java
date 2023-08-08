public class Primes{
	public static void main(String[] args){
		for (int n=2; n<1000; ++n){
			if (isPrime(n))
				printPrime(n);
		}
    }
    // defining function
    public static boolean isPrime(int num){
    	for (int d =2; d <= num/2; ++d){
    		if (num%d == 0)
    			return false;
     	}  
    	return true;
    }
    // defining function
    public static void printPrime(int num){
    	System.out.println(num);
    }
    // test a method by calling it in main function
    /**
    public static void main(String[] args){
		System.out.println(isPrime(123));
	}
	**/
}