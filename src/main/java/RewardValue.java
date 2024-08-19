public class RewardValue {
    private double cash;
    private double miles;

    private static final double miles_to_cash_rate = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash / miles_to_cash_rate;
    }

    public static RewardValue fromMiles(double miles) {
        RewardValue rewardValue = new RewardValue(miles * miles_to_cash_rate);
        rewardValue.miles = miles;
        return rewardValue;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles;
    }
}
