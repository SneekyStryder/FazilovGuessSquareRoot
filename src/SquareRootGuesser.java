public class SquareRootGuesser {
    private double num;
    private double bet1;
    private double bet2;
    private double answer;

    public SquareRootGuesser(double num) {
        this.num = num;
        answer = Math.sqrt(num);
    }

    public double getBet1() {
        return bet1;
    }

    public double getBet2() {
        return bet2;
    }

    public void findBet1() {
        int i = 1;
        boolean notFound = true;
        while (notFound) {
            if ((Math.sqrt(num - i) * 10) % 10 == 0) {
                bet1 = Math.sqrt(num - i);
                notFound = false;
            }
            else {
                i++;
            }
        }
    }

    public void findBet2() {
        int i = 1;
        boolean notFound = true;
        while (notFound) {
            if ((Math.sqrt(num + i) * 10) % 10 == 0) {
                bet2 = Math.sqrt(num + i);
                notFound = false;
            }
            else {
                i++;
            }
        }
    }

    public double compGuess(double threshold) {
        double thresholdAnswer = answer;
        int counter = 0;
        double tempThreshold = threshold;
        while (tempThreshold != 1) {
            tempThreshold = tempThreshold * 10;
            counter++;
        }
        for (int i = 1; i <= counter; i++) {
            thresholdAnswer = thresholdAnswer * 10;
        }
        thresholdAnswer = (int) thresholdAnswer;
        for (int i = 1; i <= counter; i++) {
            thresholdAnswer = thresholdAnswer / 10;
        }
        double limit1 = bet1;
        double limit2 = bet2;
        double guess = (limit1 + limit2) / 2;
        double guessSquared = guess * guess;
        while (((((int) (guessSquared * (Math.pow(10, counter)))) / (Math.pow(10, counter))) != thresholdAnswer + threshold) || (guessSquared != thresholdAnswer - threshold)) {
            if (guessSquared > answer) {
                guessSquared -= threshold;
            }
            else if (guessSquared < answer) {
                guessSquared += threshold;
            }
        }
        return guessSquared;
    }

}
