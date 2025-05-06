import java.time.LocalDate;

public class MonthlyPayment extends Payment {

    public MonthlyPayment(double amount, LocalDate payTime, int priority, String payName, Boolean enabled) {
        super(amount, payTime, priority, payName, enabled);
    }

    @Override
    public double getMonthlyPayment() {
        return amount;
    }


}
