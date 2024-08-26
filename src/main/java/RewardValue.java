public class RewardValue {

    private double cashValue;
    private int miles;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }

    public double getMilesValue() {
        return cashValue / 0.0035;

    }

    public double getCashValue() {
        return cashValue;
    }
}
