public class Main {

    // Method to perform binary search
    public static int binarySearch(int[] arr, int n, int target) {
        int s = 0;
        int e = n - 1;
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            
            if (target == arr[mid]) {
                return mid;  // Target found, return index
            }

            if (target > arr[mid]) {
                s = mid + 1;  // Target is in the right half
            }

            if (target < arr[mid]) {
                e = mid - 1;  // Target is in the left half
            }
        }
        
        return -1;  // Target not found, return -1
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int size = arr.length;
        int target = 3;

        int ans = binarySearch(arr, size, target);
        System.out.println(ans);  // Output will be -1
    }
}