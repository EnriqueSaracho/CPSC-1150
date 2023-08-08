public class RecursiveBinarySearch{ 
	public static void main(String args[]){
		int [] sortedData = new int[] {2, 4, 6, 7, 8, 10, 13, 15};
		System.out.println(binSearch(sortedData, 8));
		System.out.println(recBinSearch(sortedData, 8));
	}

	public static int recBinSearch(int [] list, int key){  //helper function 
		return recBinSearch(list, key, 0, list.length-1); // recursive function 
	}

	public static int recBinSearch(int [] list, int key, int first, int last){
		if (first > last)   //base case: invalid list to search into
			return -1;    // key is not found
    	int mid = (first + last)/2; 
    	if (key == list[mid])
			return mid; // found the location of key
		if (key > list[mid]) 
			return recBinSearch(list, key, mid+1, last); // search the key in sublist between mid+1 and last
		return recBinSearch(list, key, first, mid-1); // search the key in sublist between first and mid-1
	}

	public static int binSearch(int [] list, int key){
		int first = 0; 
		int last = list.length-1;
		int mid;
		while (first <= last){
			mid = (first +last )/2;
			if (key == list[mid])   // found the location of key
				return mid;
			else if (key > list[mid])  // search the key in sublist between mid+1 and last
				first = mid +1; 
			else           // search the key in sublist between first and mid-1
				last = mid -1;
		}
		return -1; // key is not found
	}

	
}