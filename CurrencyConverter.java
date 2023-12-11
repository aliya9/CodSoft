import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyConverter {
    private static final String API_KEY = "5f8cf4cd2472c7f594c041d3";

    public static void main(String[] args) {
        // Replace with your desired currencies and amount
        String fromCurrency = "USD";
        String toCurrency = "EUR";
        double amount = 100.0;

        try {
            double convertedAmount = convertCurrency(fromCurrency, toCurrency, amount);
            System.out.printf("%.2f %s is %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static double convertCurrency(String fromCurrency, String toCurrency, double amount) throws Exception {
        String url = "https://v6.exchangerate-api.com/v6/5f8cf4cd2472c7f594c041d3/latest/USD";  // Replace with the correct API endpoint

        // Make a GET request to the API
        URL apiUrl = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
        connection.setRequestMethod("GET");

        // Read the response
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        reader.close();

        // Parse the response to get the exchange rate
        // Adjust this part based on the actual response format from the API
        double exchangeRate = 1.0;  // Default to 1 for simplicity
        // Extract exchange rate from the response

        // Perform the currency conversion
        return amount * exchangeRate;
    }
}
