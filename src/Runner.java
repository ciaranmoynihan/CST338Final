import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Add a monthly payment: ");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        System.out.println("Amount to add: " + amount);
        PaymentManager paymentManager = new PaymentManager();
        System.out.println("Enter the date: ");
        scanner.nextLine();
        String date = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate payTime = LocalDate.parse(date, formatter);
        System.out.println("Date to be added: " + payTime);
        System.out.println("Enter the priority: ");
        int priority = scanner.nextInt();
        System.out.println("Priority to be added: " + priority);
        System.out.println("Enter the Name: ");
        String payName = scanner.next();
        System.out.println("Name to be added: " + payName);
        System.out.println("Enter whether its enabled or not (true or false): ");
        boolean enabled = scanner.nextBoolean();
        Payment testMonth = new MonthlyPayment(amount,payTime,priority,payName,enabled);
        paymentManager.addPayment(testMonth);
        System.out.println("That Payment: " + testMonth);
        System.out.println("Enter the date: ");
        scanner.nextLine();
        String newDate = scanner.nextLine();
        LocalDate weeklyDate = LocalDate.parse(newDate, formatter);
        Payment testWeekly = new WeeklyPayment(10.99,weeklyDate,1,"Disney+",true);
        paymentManager.addPayment(testWeekly);
        System.out.println("Enter the date: ");
        //scanner.nextLine();
        date = scanner.nextLine();
        LocalDate thirdDate = LocalDate.parse(date, formatter);
        Payment thirdTest = new WeeklyPayment(120.99,thirdDate,3,"FFXIV",true);
        paymentManager.addPayment(thirdTest);
        Payment fourthTest = new YearlyPayment(250.99,LocalDate.parse("07/09/2025", formatter),1,"Hulu",true);
        Payment fifthTest = new YearlyPayment(150.99,LocalDate.parse("05/09/2025", formatter),1,"Youtube",true);
        paymentManager.addPayment(fourthTest);
        paymentManager.addPayment(fifthTest);

        System.out.println("Base Sort");
        for(Payment i : paymentManager.getListOfPayments()){
            if (i.getEnabled()) {
                System.out.println(i);
            }
        }
        System.out.println("Amount Sort");
        paymentManager.sortByAmount();
        for(Payment i : paymentManager.getListOfPayments()){
            if (i.getEnabled()) {
                System.out.println(i);
            }
        }
        System.out.println("Priority Sort");
        paymentManager.sortByPriority();
        for(Payment i : paymentManager.getListOfPayments()){
            if (i.getEnabled()) {
                System.out.println(i);
            }
        }
        System.out.println("Name Sort");
        paymentManager.sortByName();
        for(Payment i : paymentManager.getListOfPayments()){
            if (i.getEnabled()) {
                System.out.println(i);
            }
        }
        System.out.println("Date Sort");
        paymentManager.sortByDate();
        for(Payment i : paymentManager.getListOfPayments()){
            if (i.getEnabled()) {
                System.out.println(i);
            }
        }

        System.out.println("This Months Payments");
        for(Payment i : paymentManager.getListOfPayments()){
            System.out.println(i.getPayName() + " - " + i.getMonthlyPayment());
        }

    }
}