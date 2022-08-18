package com.ex.observer;

public class NotifactionManger implements PayMentLisnter {

    private void sendNotification(){
        System.out.println("Notification sent");
    }

    @Override
    public void paymwntMade() {
       sendNotification();

    }
}
