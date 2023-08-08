public class PassImmutables{
    public static void main(String [] args){
        String str = "Original";
        StringBuilder strb = new StringBuilder(str); 
        System.out.printf("       Object %15s %20s \n", "String", "StringBuilder");
        System.out.println("=================================================="); 
        System.out.printf("Caller method %15s %20s \n", str, strb);
        update(str, strb);
        System.out.printf("Caller method %15s %20s \n", str, strb);
    }     
    public static void update(String theStr, StringBuilder theStrBuild){
       System.out.printf("Calling method %14s %20s \n", theStr, theStrBuild);
       theStrBuild.replace(0, theStr.length(), "New Value");
       theStr = "New Value";
       System.out.printf("Calling method %14s %20s \n", theStr, theStrBuild);
    }
}