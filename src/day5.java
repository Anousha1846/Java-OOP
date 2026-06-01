public class day5 {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
            return -1;
    }
    public static void main(String[] args) {
        // int[][] arr = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        // //print
        // for(int i = 0; i<arr.length; i++){
        //     for (int j = 0; j < arr[i].length ; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        int[] array = {3, 7, 1, 6, 9};
        search(array, 2);
        System.out.println("found at " + search(array, 6));
System.out.println("found at " + search(array, 2));
        
    }
}
