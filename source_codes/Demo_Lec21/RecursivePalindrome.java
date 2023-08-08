public class RecursivePalindrome{ 
	public static void main(String args[]){
		System.out.println(isPalindrome("AbcfdCba"));
	}

	public static boolean isPalindrome(String word){  //recursive function 
		int n = word.length();
		if (n==1 || n==0)
			return true;
		char first = Character.toUpperCase(word.charAt(0)); //take the first character
		char last = Character.toUpperCase(word.charAt(n-1));  //take the last character
		//checks if first and last are equal and word without first and last charater is a palindrome.
		return first == last && isPalindrome(word.substring(1,n-1)); 
	}
}