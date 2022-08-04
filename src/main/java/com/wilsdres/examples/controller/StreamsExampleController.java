package com.wilsdres.examples.controller;

import com.wilsdres.examples.services.StreamsExplamplesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StreamsExampleController {

    @Autowired
    private StreamsExplamplesServices streamsExplamplesServices;

    @GetMapping
    public ResponseEntity<List<Integer>> getNumberForFuntionalPrograming(){
        ArrayList<Integer> numberList = streamsExplamplesServices.getNumberForFuntionalPrograming();
        return new ResponseEntity<>(numberList, HttpStatus.OK);
    }
}
