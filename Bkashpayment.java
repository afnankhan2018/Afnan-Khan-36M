public class BkashPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Making payment using Bkash");
        // Implementation of Bkash payment
        return true;
    }
}
