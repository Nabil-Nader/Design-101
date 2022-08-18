package com.ex.observer;

import java.util.ArrayList;
import java.util.List;

public class PaymentManger {


    private final List<PayMentLisnter> payMentLisnterList  = new ArrayList<>();


    //when this called , we need to call paymentManger and Notification
    // Notify some PaymentListener
    public void pay(){
        // do stuff
        payMentLisnterList.forEach(p ->p.paymwntMade());

    }

    public void registerListner(PayMentLisnter payMentLisnter){
        payMentLisnterList.add(payMentLisnter);
    }

    public void unRegisterPayMentListner(PayMentLisnter p)  {
        payMentLisnterList.remove(p);
    }
}
