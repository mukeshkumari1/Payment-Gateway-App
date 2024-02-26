package src.java.main.impl;

import src.java.main.interfaces.PaymentStrategy;

public class PaypalPaymentStrategy implements PaymentStrategy {
    String email;
    String password;

    public PaypalPaymentStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void proceedPayment(double amount) {
        System.out.println("Payment done by paypal wallet");
    }
}
