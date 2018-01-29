package week02.practic.zad05;

public class BinarySearch {

	public static void main(String[] args) {

		int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;
        int left = 0;
		int right = data.length;
		int mid;
        boolean result = false;

		// PUT YOUR CODE HERE
		do {
			mid = left + (right - left) / 2;

			if (data[mid] == numberToFind) {

				result = true;
				break;
			}

			if (data[mid] > numberToFind)
				right = mid;
			else
				left = mid + 1;


		} while (left<right);

		if (result) System.out.println(mid);
		else System.out.println(-1);

		// PUT YOUR CODE HERE
	}

}