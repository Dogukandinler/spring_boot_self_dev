package com.dodo.graphql.repository;

import com.dodo.graphql.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle , Long> {
    List<Vehicle> getByTypeLike(String type);
}
