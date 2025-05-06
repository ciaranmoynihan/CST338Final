import java.util.ArrayList;
import java.util.Comparator;

public class PaymentManager {
    private ArrayList<Payment> listOfPayments;

    public PaymentManager() {
        listOfPayments = new ArrayList<>();
    }

    public void addPayment(Payment payment){
        listOfPayments.add(payment);
    }

    public void disablePayment(Payment payment){
        payment.setEnabled(false);
    }

    public void enablePayment(Payment payment){
        payment.setEnabled(true);
    }

    public void sortByDate(){
        listOfPayments.sort(Comparator.comparing(Payment::getPayTime));
    }

    public void sortByName(){
        listOfPayments.sort(Comparator.comparing(Payment::getPayName));
    }

    public void sortByPriority(){
        listOfPayments.sort(Comparator.comparing(Payment::getPriority));
    }

    public void sortByAmount(){
        listOfPayments.sort(Comparator.comparing(Payment::getAmount));
    }

    public ArrayList<Payment> getListOfPayments() {
        return listOfPayments;
    }
}
