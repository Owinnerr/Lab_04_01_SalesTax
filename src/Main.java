public class Main {
    public static void main(String[] args)
    {
        double priceOfPurchase = 100.00; // Initialize the price of purchase and make it a double variable because it is a price
        double salesTax = 0; // Make the sales tax variable and make it a double
        salesTax = priceOfPurchase * (0.05); // Make the sales tax variable equal to 5% of the price of the purchase (0.05 because it is a double variable)
        System.out.println("The price of your item is $" + priceOfPurchase + " and the and the sales tax is $" + salesTax); // Output the price and output the sales tax
    }
}