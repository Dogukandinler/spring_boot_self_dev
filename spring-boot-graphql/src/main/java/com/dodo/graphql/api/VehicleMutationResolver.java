package com.dodo.graphql.api;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.dodo.graphql.dto.VehicleDto;
import com.dodo.graphql.entity.Vehicle;
import com.dodo.graphql.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@RequiredArgsConstructor
@Component
public class VehicleMutationResolver implements GraphQLMutationResolver {
    private final VehicleRepository vehicleRepository;


    public Vehicle createVehicle(VehicleDto vehicleDto){
       return vehicleRepository.save(dtoToEntity(vehicleDto));

    }

    private Vehicle dtoToEntity(VehicleDto vehicleDto){
        Vehicle vehicle = new Vehicle();
        vehicle.setType(vehicleDto.getType());
        vehicle.setBrandName(vehicleDto.getBrandName());
        vehicle.setModelCode(vehicleDto.getModelCode());
        vehicle.setLaunchDate(new Date());
        return vehicle;
    }
}
