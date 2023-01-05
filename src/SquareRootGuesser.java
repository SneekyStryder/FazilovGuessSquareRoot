public class SquareRootGuesser {
    private double num;
    private int bet1;
    private int bet2;

    public SquareRootGuesser(double num) {
        this.num = num;
    }

    public int getBet1() {
        return bet1;
    }

    public int getBet2() {
        return bet2;
    }

    public void findBet1() {
        int i = 0;
        boolean notFound = true;
        while (notFound) {
            if ((Math.sqrt(num - i) * 10) % 10 == 0) {
                bet1 = (int) Math.sqrt(num - i);
                notFound = false;
            }
            else {
                i++;
            }
        }
    }

    public void findBet2() {
        int i = 0;
        boolean notFound = true;
        while (notFound) {
            if ((Math.sqrt(num + i) * 10) % 10 == 0) {
                bet2 = (int) Math.sqrt(num + i);
                notFound = false;
            }
            else {
                i++;
            }
        }
    }

}
