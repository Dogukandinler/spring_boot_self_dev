package com.dodo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
@Api(value ="My Pet Api DOC")
public class PetController {
    private List<Pet> petList = new ArrayList<>();

    @PostConstruct
    public void init(){
        petList.add(new Pet(15,"Test Pet",new Date()));
    }

    @PostMapping
    @ApiOperation(value = " new pet insertion method" , notes = "Use carefully this method")
    public  ResponseEntity<Pet> save(@RequestBody @ApiParam (value = "My Pet")  Pet pet){
        petList.add(pet);
        return ResponseEntity.ok(pet);

    }

    @GetMapping
    @ApiModelProperty(value = "pet list method", notes = "this method list all pet")
    public ResponseEntity<List<Pet>> listAll(){
        return ResponseEntity.ok(petList);

    }

}
