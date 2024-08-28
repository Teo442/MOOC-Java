
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        
        int number = Integer.valueOf(scanner.nextLine());
        
        int check = number % 2; 
        
        // cond
        
        if(check == 0){
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }
    }
}
