public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {-18,-12,2,4,6,8,9,12,24,45,50,55,67,78};
        int target = -12;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element0
            // int mid = (start+end) /2 ; // might be possible that (start + end) exceed the range of integer hence it may give you error

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
