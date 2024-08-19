public class RewardValue {
    private double cash;
    private int miles;

    static final double miles_to_cash_rate = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int) (cash / miles_to_cash_rate);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = miles * miles_to_cash_rate;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }
}
