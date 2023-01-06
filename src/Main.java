import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What number do you want to find the square root of: ");
        double userNum = scan.nextDouble();
        SquareRootGuesser guesser = new SquareRootGuesser(userNum);
        guesser.findBet1();
        guesser.findBet2();
        System.out.println("sqrt(" + (double) userNum + ") is between " + guesser.getBet1() + " and " + guesser.getBet2());
        System.out.print("How close would you like the estimate to be: ");
        double threshold = scan.nextDouble();
        System.out.println("Square root of " + (double) userNum + " is about " + guesser.compGuess(threshold));

    }
}
