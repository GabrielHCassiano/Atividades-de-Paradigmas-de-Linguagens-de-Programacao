
interface StripePayment {
    void pay(int amount);
}

class StripePaymentImpl implements StripePayment {
    public void pay(int amount) {
        System.out.println("Pagamento de $" + amount + " via Stripe processado.");
    }
}

class PaypalPayment {
    public void sendPayment(int amount) {
        System.out.println("Pagamento de $" + amount + " via PayPal processado.");
    }
}

class PaypalAdapter implements StripePayment {
    private PaypalPayment paypalPayment;
    public PaypalAdapter(PaypalPayment paypalPayment) {
        this.paypalPayment = paypalPayment;
    }
    public void pay(int amount) {
        paypalPayment.sendPayment(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        StripePayment stripePayment = new StripePaymentImpl();
        PaypalPayment paypal = new PaypalPayment();
        StripePayment paypalAdapter = new PaypalAdapter(paypal);
        
        processPayment(stripePayment, 100);
        processPayment(paypalAdapter, 200);
    }

    public static void processPayment(StripePayment paymentSystem, int amount) {
        paymentSystem.pay(amount);
    }
}