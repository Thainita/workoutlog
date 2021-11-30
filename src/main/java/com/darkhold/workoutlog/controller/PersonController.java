package com.darkhold.workoutlog.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping("/creation")
    public ResponseEntity<?> createPerson(){ //@RequestBody PersonDTO personDTO

        return ResponseEntity.ok().body("Requisiçao processada com sucesso");
    }


}
