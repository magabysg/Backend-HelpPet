package com.senai.pet.controller;

import com.senai.pet.entity.Animal;
import com.senai.pet.service.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animais")
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animal> mostrarAnimais(){
        return animalService.mostrarAnimal();
    }

    @PostMapping
    public void criaAnimal(@RequestBody Animal animalCriar){
        animalService.cadastrarAnimal(animalCriar);
    }

}
