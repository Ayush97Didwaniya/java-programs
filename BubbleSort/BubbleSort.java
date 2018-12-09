public class BubbleSort {
	
	public static void main(String[] args) {
		int[] a={1,3,4,5,7,9,13,15,16,17,19};
		int n= a.length;
		bubbleSort(4, a, 0, n-1);
	}
	
	static void bubbleSort(int v,int[] array,int lowest,int high){
		int middle=(lowest+high)/2;
		if(lowest>high){
			System.out.println("not found");
		}
		if(v==array[middle]){
			System.out.println(middle);
		}
		else if(v>array[middle]){
			bubbleSort(v, array,middle+1, high);
		}
		else{
			bubbleSort(v, array, lowest, middle-1);
		}
	}

}
