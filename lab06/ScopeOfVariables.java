public class ScopeOfVariables {
    //final static int ADD = 15;
    public static void main(String []args){
        //final int ADD = 10;
        double x = 10;
        //System.out.print("In main before updating - ");
        //System.out.println("x = " + x ) ;
        update(x);
        //System.out.print("In main after updating - ");
        //System.out.println("x = " + x) ;
    }
    
    public static void update (double x){
        final int ADD = 5;
        //System.out.print("In update before updating - ");
        //System.out.println("x = " + x ) ;
        x += ADD;
        System.out.print("In update after updating - ");
        System.out.println("x = " + x ) ;
    }
}