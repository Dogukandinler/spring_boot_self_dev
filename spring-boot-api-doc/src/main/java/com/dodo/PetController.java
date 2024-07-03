package com.dodo;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class PetController {
    private List<Pet> petList = new ArrayList<>();



    @PostConstruct
    public void init(){
        petList.add(new Pet(15,"Test Pet",new Date()));
    }
    @Operation(summary = "Get all entities")
    @PostMapping
    public  ResponseEntity<Pet> save(@RequestBody  Pet pet){
        petList.add(pet);
        return ResponseEntity.ok(pet);

    }
    @Parameter(description = "Stream name", example = "gaming")
    @Operation(summary = "Get all entsssssssities")
    @GetMapping
    public ResponseEntity<List<Pet>> listAll(){
        return ResponseEntity.ok(petList);

    }

}
