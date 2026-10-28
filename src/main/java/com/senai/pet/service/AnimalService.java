package com.senai.pet.service;

import com.senai.pet.entity.Animal;
import com.senai.pet.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> mostrarAnimal(){
        List<Animal> animalList = new ArrayList<>();
        return animalList = animalRepository.findAll();
    }

    public void cadastrarAnimal(Animal animals){
        Animal animal = new Animal();
        animal.setNome(animals.getNome());
        animal.setCastrado(animals.isCastrado());
        animal.setEspecie(animals.getEspecie());
        animal.setRaca(animals.getRaca());
        animal.setSexo(animals.getSexo());
        animal.setCor(animals.getCor());
        animal.setDataNascimento(animals.getDataNascimento());
        animal.setPeso(animals.getPeso());
        animal.setObcervacoes(animals.getObcervacoes());
        animal.setVacinacao(animals.getVacinacao());
        animalRepository.save(animal);
    }



}
