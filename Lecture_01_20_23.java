import java.util.*;
public class Lecture_01_20_23 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      // int name = scan.nextInt();
      // if (name > 100) name -= 10;
      // System.out.println("Discount cost: " + name);
		// String s1 = "his";
		// String s2 = "cycle";
		// if (s1.compareTo(s2) < 0){
		// 	System.out.println(s2);
		// } else {
		// 	System.out.println(s1);
		// }
		int n = scan.nextInt();
		boolean fizz = n % 3 == 0;
		boolean buzz = n % 5 == 0;
		boolean fizzbuzz = n % 3 == 0 && n % 5 == 0;
		System.out.println("Fizz = " + fizz);
		System.out.println("Buzz = " + buzz);
		System.out.println("FizzBuzz = " + fizzbuzz);
   }
}
