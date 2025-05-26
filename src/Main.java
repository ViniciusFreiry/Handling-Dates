import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();
        LocalDate firstInstallmentDate = LocalDate.of(2025, 8, 2);
        LocalDate secondInstallmentDate = firstInstallmentDate.plusDays(30);

        System.out.println("Today Date: " + todayDate);
        System.out.println("First Installment Date: " + firstInstallmentDate);
        System.out.println("Second Installment Date: " + secondInstallmentDate + "\n");

        if (firstInstallmentDate.isEqual(todayDate)) {
            System.out.println("Today is the due date!");
        } else if (firstInstallmentDate.isBefore(todayDate)) {
            System.out.println("Payment overdue.");
        } else {
            System.out.println("It's not the due date yet!");
        }
    }
}