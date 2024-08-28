
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the gift?");

        double giftValue = Double.valueOf(scanner.nextLine());

        // min value
        double minOne = 5000.0;
        double minTwo = 25000.0;
        double minThree = 55000.0;
        double minFour = 200000.0;
        double minFive = 1000000.0;

        // lower tax
        double lowerLevelOne = 100.0;
        double lowerLevelTwo = 1700.0;
        double lowerLevelThree = 4700.0;
        double lowerLevelFour = 22100.0;
        double lowerLevelFive = 142100.0;

        // tax rate
        double taxOne = 0.08;
        double taxTwo = 0.10;
        double taxThree = 0.12;
        double taxFour = 0.15;
        double taxFive = 0.17;

        // tax calc
        double tax01 = (lowerLevelOne + ((giftValue - minOne) * taxOne));
        double tax02 = (lowerLevelTwo + ((giftValue - minTwo) * taxTwo));
        double tax03 = (lowerLevelThree + ((giftValue - minThree) * taxThree));
        double tax04 = (lowerLevelFour + ((giftValue - minFour) * taxFour));
        double tax05 = (lowerLevelFive + ((giftValue - minFive) * taxFive));

        if (giftValue >= 5000) {
            if (giftValue >= 5000 && 25000 > giftValue) {
                if (giftValue == 5000) {
                    System.out.println("Tax: " + lowerLevelOne);
                } else {
                    System.out.println("Tax " + tax01);
                }
            } else if (giftValue >= 25000 && 55000 >= giftValue) {
                if (giftValue == 25000) {
                    System.out.println("Tax: " + lowerLevelTwo);
                } else {
                    System.out.println("Tax " + tax02);
                }
            } else if (giftValue >= 55000 && 200000 > giftValue) {
                if (giftValue == 55000) {
                    System.out.println("Tax: " + lowerLevelThree);
                } else {
                    System.out.println("Tax: " + tax03);
                }
            } else if (giftValue >= 200000 && giftValue < 1000000) {
                if (giftValue == 200000) {
                    System.out.println("Tax: " + lowerLevelFour);
                } else {
                    System.out.println("Tax: " + tax04);
                }
            } else if (giftValue >= 1000000) {
                if (giftValue == 1000000) {
                    System.out.println("Tax: " + lowerLevelFive);
                } else {
                    System.out.println("Tax: " + tax05);
                }
            }
        } else {
            System.out.println("No tax!");
        }
    }
}
