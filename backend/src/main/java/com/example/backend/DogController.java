package com.example.backend;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dog")
public class DogController {

    @GetMapping
    public String getName(){
        return "Wuffi";
    }




    @PostMapping
    public String createStory(@RequestBody String story){
        return "Wuffis new Story: " + story;
    }
}
