public class day4 {
    // public static int factorial(int n) {
    //     int fact=1;
    //     for (int i = n; i >= 1; i--) {
    //         fact *= i;
    //     }
    //     return fact;
    // }
    // public static int factRecursive(int n) {
    //     if (n == 0 || n == 1) {
    //         return 1;
    //     }
    //     return n*factRecursive(n-1);
    // }
    public static void StringReverse(String str) {
        
        for(int i = str.length()-1 ; i>=0; i--){
          System.out.print(str.charAt(i));
        }
    }
    public static String StrRevRecusive(String str) {
      if (str.length() <=1) {
        return str;
      }
      return str.charAt(str.length()-1) + StrRevRecusive(str.substring(0, str.length()-1));
    }
  public static void main(String[] args) {
        // System.out.println(factorial(8));//iterative
        // System.out.println(factRecursive(6));
        StringReverse("hello");
        System.out.println(StrRevRecusive("jonita"));
  }
}
