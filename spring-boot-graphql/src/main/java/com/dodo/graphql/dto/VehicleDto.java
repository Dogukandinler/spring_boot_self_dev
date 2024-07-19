package com.dodo.graphql.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class VehicleDto {

    private String type;
    private String modelCode;
    private String brandName;
}
