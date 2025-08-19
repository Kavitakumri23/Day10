public class OrderAgnostic {
    public static void main(String[] args) {
//        int [] arr = {-18,-12,2,4,6,8,9,12,24,45,50,55,67,78};
        int [] arr = {78, 67,56,45,43,34,23,12,10,9,8,6,4,3,2};

        int target = 67;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);


    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
