package com.dodo.graphql.api;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.dodo.graphql.entity.Vehicle;
import com.dodo.graphql.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class VehicleQueryResolver implements GraphQLQueryResolver {

    public final VehicleRepository vehicleRepository;

    public List<Vehicle> getVehicles(String type){
        return  vehicleRepository.getByTypeLike(type);

    }
    public Optional<Vehicle> getById(Long id){
    return vehicleRepository.findById(id);
    }
}
