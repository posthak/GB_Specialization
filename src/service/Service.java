package service;

import animalgroup.AnimalGroup;

import java.time.Instant;
import java.util.List;

import animal.Animal;
import animal.AnimalForm;
import animal.Animaltype;

public class Service {

    private AnimalGroup group;

    public Service() {
        this.group = new AnimalGroup();
    }

    public int addAnimal(AnimalForm animalForm, Instant dateOfBirth, String animalName, Animaltype animalType,
            String command) {
        if (group.getAnimalByName(animalName) == null) {
            group.addAnimal(new Animal(animalForm, dateOfBirth, animalName, animalType, command));
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
