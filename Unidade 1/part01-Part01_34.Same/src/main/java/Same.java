
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here.
        
        System.out.println("Enter the first string:");
        
        String input = scanner.nextLine();
        
        System.out.println("Enter the second string:");
        
        String input2 = scanner.nextLine();
        
        if(input.equals(input2)){
            System.out.println("Same");
        } else{
            System.out.println("Different");
        }
    }
}
