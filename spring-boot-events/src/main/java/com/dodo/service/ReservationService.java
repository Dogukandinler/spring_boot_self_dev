package com.dodo.service;



import com.dodo.api.HotelBookRequest;
import com.dodo.event.ReservationCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Async
    public void publishReservationEvent(HotelBookRequest hotelBookRequest){
        applicationEventPublisher.publishEvent(new ReservationCreatedEvent(hotelBookRequest));
    }
}
