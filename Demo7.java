// Q1: Find First and Last Position of Element in Sorted Array
public class Demo7 {
    // Method to find first occurrence
    public static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;        // store index
                right = mid - 1;  // search left part
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    // Method to find last occurrence
    public static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;       // store index
                left = mid + 1;  // search right part
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        System.out.println("First Position: " + first);
        System.out.println("Last Position: " + last);
    }
}


