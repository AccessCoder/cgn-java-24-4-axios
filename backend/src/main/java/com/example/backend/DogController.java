package com.example.backend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/dog")
public class DogController {

    @GetMapping
    public String getName(){
        return "Wuffi";
    }

    @GetMapping("/story")
    public String getStory(){
        return "Wuffi likes his Owner";
    }

    @PostMapping
    public String createStory(@RequestBody String story){
        return "Wuffis new Story: " + story;
    }

    @ExceptionHandler(NoSuchElementException.class) //Lokal = prio 1
    ResponseEntity<String> handleNoSuchElementException(NoSuchElementException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }


}
