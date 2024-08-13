

import com.mycompany.ecommerce.checkout.PaymentProcessor;

public class CheckoutService {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(100.0);
    }
}
