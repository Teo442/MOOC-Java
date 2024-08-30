
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int number = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from?");
        int count = Integer.valueOf(scanner.nextLine());
        
        while(count <= number){
            System.out.println(count);
            count++; 
        }
    }
}
