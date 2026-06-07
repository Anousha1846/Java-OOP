
public class day5 {

    // SEARCH — find target in array, return index or -1 if not found — O(n)
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // not found
    }

    // INSERT — insert value at index, shift elements right, last element dropped — O(n)
    public static int insert(int[] arr, int index, int valueToInsert) {
        if (index < 0 || index > arr.length) {
            System.out.println("Index out of bounds");
            return -1;
        }
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1]; // shift right
        }
        arr[index] = valueToInsert;
        return index;
    }

    // DELETE — remove element at index, shift elements left, last position becomes 0 — O(n)
    public static int delete(int[] arr, int index) {
        if (index < 0 || index > arr.length) {
            System.out.println("Index out of bounds");
            return -1;
        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1]; // shift left
        }
        arr[arr.length - 1] = 0; // clear last element
        return index;
    }

    //binary search — O(log n) — only works on sorted arrays
    public static int BinSearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        // int[] array = {3, 7, 1, 6, 9};

        // // SEARCH
        // System.out.println("Search 6 → index: " + search(array, 6));  // 3
        // System.out.println("Search 2 → index: " + search(array, 2));  // -1 not found

        // // INSERT — insert 99 at index 2
        // insert(array, 2, 99);
        // System.out.print("After insert 99 at index 2: ");
        // for (int x : array) {
        //     System.out.print(x + " ");
        // }
        // System.out.println();

        // // DELETE — delete element at index 3
        // delete(array, 3);
        // System.out.print("After delete at index 3: ");
        // for (int x : array) {
        //     System.out.print(x + " ");
        // }
        // System.out.println();

        // int[] sorted = {1, 3, 5, 7, 9, 11, 13};
        // System.out.println("BinSearch 7 → index: " + BinSearch(sorted, 7));
        // System.out.println("BinSearch 6 → index: " + BinSearch(sorted, 6));
        // int[] unsorted = {1, 3, 4, 2, 2};
        // for (int i = 0; i < unsorted.length; i++) {
        //     for (int j = i + 1; j < unsorted.length; j++) {
        //         if (unsorted[i] == unsorted[j]) {
        //             System.out.println("Duplicate found: " + unsorted[i]);
        //         }
        //     }
        // }
        int[] arr =  {1, 2, 3, 4, 5};
        int left =0;
        int right = arr.length -1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
