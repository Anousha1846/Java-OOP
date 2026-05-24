// PSL - Ex:1
// Most specific condition goes first, most general goes last.
public class day3 {
    public static void main(String[] args) {
    //     for(int i = 1; i<=100; i++){
    //         if (i%3 == 0 && i%5 == 0) {
    //             System.out.println  ("FizzBuzz");
    //         }else if (i%3 == 0) {
    //             System.out.println("Fizz");
    //         }else if(i%5 == 0){
    //             System.out.println("Buzz");
    //         }else{
    //             System.out.println(i);
    //         }
    //     }
    

//PSL 2 — Right-angle triangle of stars
for(int i = 1; i <= 5; i++){ 
    for(int j = 1 ; j<=i; j++){
    System.out.print("*");
    }
    System.out.println();
}
}
}

