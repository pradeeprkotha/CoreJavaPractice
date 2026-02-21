package hcrank;

import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;

public class Dateformat {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 8, 5); // Year, Month, Day

        double payment = 200;
        // Get the day of the week
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println("US: " +getPayementString(payment, "united states"));
        System.out.println("India: " + getPayementString(payment, "india"));
        System.out.println("China: " + getPayementString(payment, "china"));
        System.out.println("France: " + getPayementString(payment, "france"));
    }

    public static String getPayementString(double payment, String country){

        NumberFormat formatter = NumberFormat
                .getCurrencyInstance(getLocaleFromCountryName(country));
        String formatted = formatter.format(payment);
        return formatted;
    }
    public static Locale getLocaleFromCountryName(String countryName) {
        for (Locale locale : Locale.getAvailableLocales()) {
            if (locale.getDisplayCountry().equalsIgnoreCase(countryName)) {
                return locale;
            }
        }
        return null;
    }
}
