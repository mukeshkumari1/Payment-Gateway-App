package src.java.main.service;

import src.java.main.interfaces.PaymentStrategy;

public class PaymentProcessor {
    PaymentStrategy paymentStrategy;
    // set the strategy


    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount){
        paymentStrategy.proceedPayment(amount);
    }
}
