package com.dodo;


import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.AccessMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "My User Clas")
public class Pet {
    @Schema(description = "User's ID", example = "1", accessMode = AccessMode.READ_ONLY)
    private int id;
    private String name;
    private Date date;



}
