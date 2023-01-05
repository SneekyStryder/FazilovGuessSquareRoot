import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What number do you want to find the square root of: ");
        double userNum = scan.nextDouble();
        SquareRootGuesser guesser = new SquareRootGuesser(userNum);


    }
}
