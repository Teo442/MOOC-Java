
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        
        int age = Integer.valueOf(scanner.nextLine());
        
        if(120 >= age && age >= 0){
            System.out.println("OK");
        } else{
            System.out.println("Impossible!");
        }
    }
}
