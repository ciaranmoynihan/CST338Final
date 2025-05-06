import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;


public class WeeklyPayment extends Payment {

    public WeeklyPayment(double amount, LocalDate payTime, int priority, String payName, Boolean enabled) {
        super(amount, payTime, priority, payName, enabled);
    }

    @Override
    public double getMonthlyPayment() {
        LocalDate endOfMonth = payTime.with(TemporalAdjusters.lastDayOfMonth());

        long weeksBetween = ChronoUnit.WEEKS.between(payTime, endOfMonth) + 1;

        return amount*weeksBetween;
    }

    @Override
    public void changePayTime() {
        LocalDate currentDate = LocalDate.now();
        if (currentDate.equals(payTime)) {
            payTime = payTime.plusDays(7);
        }
    }

}
