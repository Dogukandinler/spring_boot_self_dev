package com.dodo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "My pet model" , description = "My pet")
public class Pet {
    @ApiModelProperty(value = "Pet Model's id field")
    private int id;
    @ApiModelProperty (value = "Pet Model's name field")
    private String name;
    @ApiModelProperty(value = "Pet Model's date field")
    private Date date;



}
