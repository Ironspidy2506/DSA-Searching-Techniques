import java.util.*;

public class BinarySearch {
    public static int binarySearch(int[] array, int element, int beg, int end) {
        if (beg > end) {
            return -1;
        }
        int mid = (beg + end) / 2;
        if (array[mid] == element) {
            return mid;
        } else if (array[mid] < element) {
            return binarySearch(array, element, mid + 1, end);
        } else {
            return binarySearch(array, element, beg, mid - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to enter: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter element to find: ");
        int element = sc.nextInt();

        int result = binarySearch(array, element, 0, n - 1);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
