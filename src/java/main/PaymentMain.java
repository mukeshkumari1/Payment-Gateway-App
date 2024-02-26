package src.java.main;

import src.java.main.impl.PaypalPaymentStrategy;
import src.java.main.service.PaymentProcessor;
import src.java.main.service.PhonePe;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentProcessor phonePe = new PhonePe("8888888899", "123456");
        phonePe.executePayment(20001);

        PaymentProcessor paypal = new PaymentProcessor();
        paypal.setPaymentStrategy(new PaypalPaymentStrategy("abc@gmail.com", "password"));
        paypal.executePayment(10000);

    }
}
