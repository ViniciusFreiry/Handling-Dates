import java.time.*;
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

        // Using LocalTime
        LocalTime start = LocalTime.now();
        LocalTime end = LocalTime.of(22, 0);

        // Using Duration
        Duration duration = Duration.between(start, end);
        System.out.println("\nTime between now and 10 PM: " + duration.toHours() + " Hours and "
                + duration.toMinutesPart() + " Minutes");

        // Using Period
        LocalDate paymentDate = LocalDate.parse("2025-05-26");
        Period period = Period.between(paymentDate, firstInstallmentDate);

        System.out.println("Difference between payment date and first installment date: "
                + (period.getYears() * 365 + period.getMonths() * 30 + period.getDays()));
    }
}