import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class YearlyPayment extends Payment {

    public YearlyPayment(double amount, LocalDate payTime, int priority, String payName, Boolean enabled) {
        super(amount, payTime, priority, payName, enabled);
    }

    @Override
    public double getMonthlyPayment() {
        LocalDate currentDate = LocalDate.now();

        if (currentDate.getMonthValue() == payTime.getMonthValue()) {
            return amount;
        }
        return 0.0;

    }

    @Override
    public void changePayTime() {
        LocalDate currentDate = LocalDate.now();
        if (currentDate.equals(payTime)) {
            payTime.plusYears(1);
        }
    }

}
