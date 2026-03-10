package com.zero.to.hero.springtransaction.transaction_propagation.code.handler;

import com.zero.to.hero.springtransaction.transaction_propagation.code.entity.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NotificationHandler {

    @Transactional(propagation = Propagation.NEVER)
    public void sendOrderConfirmationNotification(Order order) {

        //send mail for order confirmation
        System.out.println("Order has been placed!!");
    }

}
