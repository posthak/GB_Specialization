package service;

import animalgroup.AnimalGroup;

import java.time.Instant;
import java.util.List;

import animal.Animal;
import animal.Camel;
import animal.Cat;
import animal.Dog;
import animal.Donkey;
import animal.Hamster;
import animal.Horse;

public class Service {

    private AnimalGroup group;

    public Service() {
        this.group = new AnimalGroup();
    }

    public int addCat(Instant dateOfBirth, String animalName, String command) {
        if (group.getAnimalByName(animalName) == null) {
            group.addCat(new Cat(dateOfBirth, animalName, command));
            return 1;
        } else {
            return 0;
        }
    }

    public int addHamster(Instant dateOfBirth, String animalName, String command) {
        if (group.getAnimalByName(animalName) == null) {
            group.addHamster(new Hamster(dateOfBirth, animalName, command));
            return 1;
        } else {
            return 0;
        }
    }

    public int addCamel(Instant dateOfBirth, String animalName, String command) {
        if (group.getAnimalByName(animalName) == null) {
            group.addCamel(new Camel(dateOfBirth, animalName, command));
            return 1;
        } else {
            return 0;
        }
    }

    public int addDog(Instant dateOfBirth, String animalName, String command) {
        if (group.getAnimalByName(animalName) == null) {
            group.addDog(new Dog(dateOfBirth, animalName, command));
            return 1;
        } else {
            return 0;
        }
    }

    public int addDonkey(Instant dateOfBirth, String animalName, String command) {
        if (group.getAnimalByName(animalName) == null) {
            group.addDonkey(new Donkey(dateOfBirth, animalName, command));
            return 1;
        } else {
            return 0;
        }
    }

    public int addHorse(Instant dateOfBirth, String animalName, String command) {
        if (group.getAnimalByName(animalName) == null) {
            group.addHorse(new Horse(dateOfBirth, animalName, command));
            return 1;
        } else {
            return 0;
        }
    }

    public int updateCommand(int id, String command) {
        if (group.getAnimalById(id) != null) {
            group.updateCommand(id, command);
            return 1;
        } else {
            return 0;
        }
    }

    public List<String> getListCommand() {
        return group.getListCommand();
    }

    public List<Animal> getAnimalList() {
        return group.getAnimalList();
    }
}
