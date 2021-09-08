package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

//    @GetMapping(value = "/whiskys")
//    public ResponseEntity<List<Whisky>> getAllWhiskys(){
//        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
//    }

//    @GetMapping(value = "/whiskys/{id}")
//    public ResponseEntity getWhisky(@PathVariable Long id){
//        return new ResponseEntity<>(whiskyRepository.findById(id), HttpStatus.OK);
//    }

    @GetMapping(value = "/whiskys")
    public ResponseEntity findWhiskysFromYear( @RequestParam(required = false, name = "year")  Integer year) {
        return new ResponseEntity<>(whiskyRepository.findWhiskyByYear(year), HttpStatus.OK);
    }




}