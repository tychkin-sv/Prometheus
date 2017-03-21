package week02.practic.zad04;

public class ShellSort {

	public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
		int length = array.length;

		//PUT YOUR CODE HERE
		int tmp;
		int d = length/2;
		while (d>0) {
		 for (int i=0; i< (length - d); i++) {
		 int j = 0;
		  while ((j<(length - d))) {
		  	if (array[j]>array[j + d]){
				  tmp = array[j];
				  array[j] = array[j + d];
				  array[j + d] = tmp;
			  }
			j++;
		  }
	     }
		d = d/2;
		}

		//PUT YOUR CODE HERE
	    
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}
} 