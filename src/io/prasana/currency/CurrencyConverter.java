package io.prasana.currency;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter amount: ");
            double amount = input.nextDouble();
            input.nextLine();

            System.out.print("Enter base currency (e.g., USD): ");
            String base = input.nextLine().toUpperCase();

            System.out.print("Enter target currency (e.g., INR): ");
            String target = input.nextLine().toUpperCase();


            String apiUrl = "https://api.exchangerate.host/convert?from=" + base + "&to=" + target + "&amount=" + amount;


            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");


            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuilder json = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                json.append(line);
            }
            reader.close();


            String jsonStr = json.toString();
            int index = jsonStr.indexOf("\"result\":");
            if (index != -1) {
                String sub = jsonStr.substring(index + 9);
                String converted = sub.split(",")[0].replace("}", "").trim();
                System.out.println("Converted amount: " + converted + " " + target);
            } else {
                System.out.println(" Conversion failed. Check currency codes or internet.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
