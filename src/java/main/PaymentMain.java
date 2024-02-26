package src.java.main;

import src.java.main.impl.PaypalPaymentStrategy;
import src.java.main.impl.UpiPaymentStrategy;
import src.java.main.interfaces.PaymentStrategy;
import src.java.main.service.PaymentProcessor;
import src.java.main.service.PhonePe;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentProcessor phonePe = new PhonePe("8888888899", "123456");
        phonePe.executePayment(20001);

        PaymentStrategy paypalPayment = new PaypalPaymentStrategy("abc@gmail.com", "password");
        PaymentProcessor paypal = new PaymentProcessor();
        paypal.setPaymentStrategy(paypalPayment);
        paypal.executePayment(10000);

    }
}
