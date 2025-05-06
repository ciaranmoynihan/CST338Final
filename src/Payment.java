import java.time.LocalDate;

public abstract class Payment {
    double amount;
    LocalDate payTime;
    int priority;
    String payName;
    Boolean enabled;

    public Payment(double amount, LocalDate payTime, int priority, String payName, Boolean enabled) {
        this.amount = amount;
        this.payTime = payTime;
        this.priority = priority;
        this.payName = payName;
        this.enabled = enabled;
    }
    abstract double getMonthlyPayment();

    abstract void changePayTime();

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public LocalDate getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDate payTime) {
        this.payTime = payTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String toString() {
        return amount + " " + payTime + " " + priority + " " + payName + " " + enabled;
    }
}
