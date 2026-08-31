
package Arrays.practice;

public class pivotIndex {

    public static int findPivot(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
                // Pivot is in right half
                low = mid + 1;
            } else {
                // Pivot is in left half (including mid)
                high = mid;
            }
        }

        return low; // Pivot index
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findPivot(arr)); // Output: 4
    }
}