package com.dodo.api;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelBookRequest {

        private String userId;

        @Override
        public String toString() {
            return "HotelBookRequest{" +
                    "userId='" + userId + '\'' +
                    ", hotelId='" + hotelId + '\'' +
                    '}';
        }

        private String hotelId;
    }

