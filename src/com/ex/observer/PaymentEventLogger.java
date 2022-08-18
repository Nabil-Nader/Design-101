package com.ex.observer;

public class PaymentEventLogger  implements  PayMentLisnter{


    @Override
    public void paymwntMade() {
        LogEvent();
    }

    private void LogEvent(){
        System.out.println("Payment Reseived");
    }
}
