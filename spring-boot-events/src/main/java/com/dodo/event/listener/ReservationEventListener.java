package com.dodo.event.listener;

import com.dodo.event.ReservationCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ReservationEventListener {

    @EventListener
    public void reservationEventHandler(ReservationCreatedEvent reservationCreatedEvent) throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("EventListener->" + reservationCreatedEvent.getSource().toString());

    }
}
