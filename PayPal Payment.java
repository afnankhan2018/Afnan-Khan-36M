public class PayPalPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Making payment using PayPal");
        // Implementation of PayPal payment
        return true;
    }
}
