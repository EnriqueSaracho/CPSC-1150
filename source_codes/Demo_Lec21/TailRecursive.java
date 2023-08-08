public class TailRecursive{    
   public static void main(String []args){
      System.out.println(factorial(4));
   }
   /*public static int factorial(int n){    
      if (n==0) //base case
         return 1;         
      return n * factorial(n-1);     
   } */

	public static int factorial(int n){         
      return factorial(n, 1);     
    }
    
    public static int factorial(int n, int fact){    
      if (n==0) //base case
         return fact;         
      return factorial(n-1, fact*n);     
   }

}
