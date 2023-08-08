public class PassArraysOfStrings{
    public static void main(String [] args){
        String [] data = new String []{"this", "is", "before", "call" }; 
        printArray("Array before call: ", data);
        update(data);
        printArray("Array after call: ", data);
    }
    public static void update(String [] array){
          array[2] = "after";
    }
    public static void printArray(String header, String [] array){
        System.out.print(header);
        for (int i=0; i < array.length; ++i)
            System.out.print(array[i] + ", ");
        System.out.println();
    }
}