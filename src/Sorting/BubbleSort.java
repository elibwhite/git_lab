package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		int n = unsortedArray.length;
		boolean flag = true;
		while(!flag){
			for(int i = 1; i < n - 1; i++){
				if(unsortedArray[i-1] > unsortedArray[i]){
					int temp = unsortedArray[i];
					unsortedArray[i] = unsortedArray[i-1];
					unsortedArray[i-1] = temp;
					flag = true;
				}
			}
		}
		
		return unsortedArray;
	}
}
