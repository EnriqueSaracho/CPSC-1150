public class CopyArrays {
  public static void main(String[] args) {
    int[] sourceArray = {2, 3, 1, 5, 10};
    int[] targetArray = new int[sourceArray.length];

    for (int i = 0; i < sourceArrays.length; i++)
        targetArray[i] = sourceArray[i];

    // displaying targetArray
    System.out.print("Target array copied by for loop is ");  
    for (int i=0; i < targetArray.length; ++i)
      System.out.print(targetArray[i] + " ");
    System.out.println();

    int[] targetArray2 = new int[sourceArray.length];
    System.arraycopy(sourceArray, 0, targetArray2, 0, sourceArray.length); 

    // displaying targetArray
    System.out.print("Target array copied by arraycopy method is ");
    for (int i=0; i < targetArray2.length; ++i)
      System.out.print(targetArray2[i] + " ");
    System.out.println();


  }
}