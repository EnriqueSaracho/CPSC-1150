public class Examples{
   public static void main(String[] args){
      System.out.println("A) 3+5*(3-8)/2 = " + (3+5*(3-8)/2));
      System.out.println("\nB) 2+8/(1+3)*2*(2+4)-12%6 = " + 
                   (2+8/(1+3)*2*(2+4)-12%6));
      System.out.println("\nC) 5-5*3/(1+(8-6))-8+3%2*6/(2-4*2)*2-1 = " +
                   (5-5*3/(1+(8-6))-8+3%2*6/(2-4*2)*2-1));
      
      int a =5, x;
      x = 3 + ++a +4;
      System.out.println("\nD) a = " + a + ", x = " +x);
      
      a =5;
      x = 3 - a++ +4;
      System.out.println("E) a = " + a + ", x = " +x);
      
      a =7;
      x=10 - --a +3;
      System.out.println("F) a = " + a + ", x = " +x);
      
      a=7;
      x=7 + a-- -3;
      System.out.println("G) a = " + a + ", x = " +x);
      
      a = 5;
      x = 5 + ++a + 2+ a + a++;
      System.out.println("H) a = " + a + ", x = " +x);
      
      int y=3;
      y*=5+2;
      System.out.println("I) y = " + y );
      
      y=6; x=5;
      y-=x++ +3;
      System.out.println("J) y = " + y + ", x = " + x);
      
      y=6; x=5;
      y%=--x +3;  
      System.out.println("K) y = " + y + ", x = " + x);
   }
}
