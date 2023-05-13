import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

        // https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf.format(payment);
        String india = "Rs."+ (NumberFormat.getCurrencyInstance(Locale.US).format(payment)).substring(1);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        String withoutLocale = NumberFormat.getCurrencyInstance().format(payment);
        System.out.println("Currency without Locale - " + withoutLocale);

        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        System.out.println("India with new Locale(en, IN): " + indiaFormat.format(payment));

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}