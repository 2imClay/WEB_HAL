package com.example.demo.controller;

import com.example.demo.entity.Exercise;
import com.example.demo.entity.Product;
import com.example.demo.repository.ExerciseRepository;
import com.example.demo.service.ExerciseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {
    private ExerciseService service;

    @GetMapping
    List<Exercise> getList() {return service.getAllExercise();}
    @GetMapping("/{exerciseID}")
    Exercise getProduct(@PathVariable("exerciseID") String exerciseID) {
        return service.getExercise(exerciseID);
    }
}
