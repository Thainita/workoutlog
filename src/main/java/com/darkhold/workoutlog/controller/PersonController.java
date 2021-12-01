package com.darkhold.workoutlog.controller;
import com.darkhold.workoutlog.dto.PersonDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    @PostMapping("/creation")
    public ResponseEntity<?> createPerson(@RequestBody PersonDTO personDTO){

        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body("{\"example\":10}");
    }


}
