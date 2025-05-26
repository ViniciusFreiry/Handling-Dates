import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Using LocalDate
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

        // Using DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("\nToday Date Formatted for Brazil: " + todayDate.format(formatter));

        // Using ZonedDateTime
        ZonedDateTime purchaseCompletionDate = ZonedDateTime.now();
        System.out.println("\nPurchase Completion Date: " + purchaseCompletionDate);

        ZonedDateTime purchaseCompletionDateNy = purchaseCompletionDate.withZoneSameInstant(
                ZoneId.of("America/New_York"));
        System.out.println("\nPurchase Completion Date in New York: " + purchaseCompletionDateNy);
    }
}