# 📅 Java Date and Time Demonstration

This Java program showcases the use of various classes from the `java.time` API to work with dates, times, periods, durations, and time zones. It simulates a real-world payment scenario by calculating installment dates, checking due dates, formatting dates, and handling time zones.

## 🧩 Features

- **LocalDate**: Handles current date, scheduled installment dates, and date comparisons.
- **DateTimeFormatter**: Formats dates to a specific locale-friendly format.
- **ZonedDateTime**: Captures the current date-time with timezone information.
- **ZoneId**: Converts the same date-time into different time zones (e.g., New York).
- **LocalTime**: Works with time-of-day values.
- **Duration**: Calculates the time remaining until a specific hour.
- **Period**: Computes the difference between two dates in days, months, and years.


## 🧠 Concepts Illustrated

- Working with **dates and times** using modern Java APIs.
- Date arithmetic using `plusDays()` and `Period.between()`.
- Formatting dates for different regional formats.
- Converting time zones using `withZoneSameInstant()`.
- Calculating durations between `LocalTime` values.

## 📎 Requirements

- Java JDK 8 or higher (with `java.time` package available).