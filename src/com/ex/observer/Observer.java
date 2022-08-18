package com.ex.observer;

public class Observer {

    public static void main(String[] args) {
        PaymentManger paymentManger = new PaymentManger();


        PayMentLisnter p1 = new NotifactionManger();
        paymentManger.registerListner(p1);

        PayMentLisnter p2 = new PaymentEventLogger();
        paymentManger.registerListner(p2);

        paymentManger.pay();
    }
}
