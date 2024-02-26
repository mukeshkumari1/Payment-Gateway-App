package src.java.main.service;

import src.java.main.impl.UpiPaymentStrategy;

public class PhonePe extends PaymentProcessor{
    PhonePe(){

    }

    public PhonePe(String phoneNumber, String otp){
        setPaymentStrategy(new UpiPaymentStrategy(phoneNumber, otp));
    }
}
