
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        
        int howManyDays = Integer.valueOf(scanner.nextLine());
        
        int minute = 60;
        int hour = minute * 60; 
        int day = hour * 24;
        
        int totalSeconds = day * howManyDays; 
        
        System.out.println(totalSeconds);
    }
}
