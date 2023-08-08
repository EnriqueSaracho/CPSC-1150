public class PassParameters{
  public static void main(String [] args){
    int n = 5;
    StringBuilder strb = new StringBuilder("Original"); 
    System.out.printf("Variable/Object %15s %20s \n", "pass-by-value", "pass-by-reference");
    System.out.println("===================================================="); 
    System.out.printf("  Caller method %15d %20s \n", n, strb);
    update(n, strb);
    System.out.printf("  Caller method %15d %20s \n", n, strb);
  }
     
  public static void update(int num, StringBuilder theStrb){
    System.out.printf("  Calling method %14d %20s \n", num, theStrb);
    theStrb.replace(0, theStrb.length(), "New Value");
    num += 10 ;
    System.out.printf("  Calling method %14d %20s \n",num, theStrb);
  }
}