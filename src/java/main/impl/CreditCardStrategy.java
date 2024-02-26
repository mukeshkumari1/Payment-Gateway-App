package src.java.main.impl;

import src.java.main.interfaces.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {
    String creditCardNumber;
    String cvv;
    String expiryDate;

    public CreditCardStrategy(String creditCardNumber, String cvv, String expiryDate) {
        this.creditCardNumber = creditCardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void proceedPayment(double amount) {
        System.out.println("Payment done by credit card");
    }
}
