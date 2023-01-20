import java.util.Scanner;
public class Lecture_01_18_23 {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a number ");
            int myInt = in.nextInt();
            myInt += 456;
            System.out.println(myInt);
            System.out.print("Enter a number: ");
            String n1 = in.next();
            System.out.print("Enter another number: ");
            int n2 = in.nextInt();
            String result = n1 + n2;
            System.out.println(result);
            System.out.println("ABCDE\"\\");
            
        }
    }
}
