public class Demo6{
    // Recursive Binary Search method
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            // Element found
            if (arr[mid] == target) {
                return mid;
            }

            // If target is smaller, search left subarray
            if (arr[mid] > target) {
                return binarySearch(arr, left, mid - 1, target);
            }

            // If target is larger, search right subarray
            return binarySearch(arr, mid + 1, right, target);
        }
        // If element not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 72;

        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

