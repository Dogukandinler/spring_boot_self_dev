package com.dodo.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@Builder
@ToString
@Data
public class Employee {

    @Id
    private String id;
    private String name;
    private String lastname;
    private LocalDate birthday;
}
