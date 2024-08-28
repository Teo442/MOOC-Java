
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points [0-100]:");

        int points = Integer.valueOf(scanner.nextLine());

        // cond
        if (points > 100) {
            System.out.println("incredible!");
        } else if (100 >= points && points >= 90) {
            System.out.println("5");
        } else if (89 >= points && points >= 80) {
            System.out.println("4");
        } else if (79 >= points && points >= 70) {
            System.out.println("3");
        } else if (69 >= points && points >= 60) {
            System.out.println("2");
        } else if (59 >= points && points >= 50) {
            System.out.println("1");
        } else if (49 >= points && points >= 0) {
            System.out.println("failed");
        } else if (0 > points) {
            System.out.println("impossible!");
        }
    }
}
