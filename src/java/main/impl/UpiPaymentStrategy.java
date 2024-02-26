package src.java.main.impl;

import src.java.main.interfaces.PaymentStrategy;

public class UpiPaymentStrategy implements PaymentStrategy {
    String phoneNumber;
    //String email;
   // String upiId;
    String otp;

    public UpiPaymentStrategy(String phoneNumber, String otp) {
        this.phoneNumber = phoneNumber;
        this.otp = otp;
    }

    @Override
    public void proceedPayment(double amount) {
        System.out.println("Payment done by UPI id!!" + "Amount is : "+ amount);
    }
}
