public class day4 {
    // public static int factorial(int n) {
    //     int fact=1;
    //     for (int i = n; i >= 1; i--) {
    //         fact *= i;
    //     }
    //     return fact;
    // }
    public static int factRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n*factRecursive(n-1);
    }
  public static void main(String[] args) {
        // System.out.println(factorial(8));//iterative
        System.out.println(factRecursive(6));
  }
}
