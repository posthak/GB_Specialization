package animalgroup;

import animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalGroup {
    private List<Animal> animalList;

    public AnimalGroup() {
        animalList = new ArrayList<>();
    }

    public void updateCommand(int id, String command) {
        for (Animal t : animalList) {
            if (t.getId().compareTo(id) == 0) {
                t.setCommand(command);
            }
        }
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public Animal getAnimalByName(String animalName) {
        return checkAnimalByName(animalName);
    }

    public List<String> getListCommand() {
        List<String> list = new ArrayList<>();
        for (Animal t : animalList) {
            list.add(t.getCommand());
        }
        return list;
    }

    public Animal getAnimalById(Integer id) {
        return checkAnimalById(id);
    }

    public Animal checkAnimalById(int id) {
        for (Animal t : animalList) {
            if (t.getId().compareTo(id) == 0) {
                return t;
            }
        }
        return null;
    }

    public Animal checkAnimalByName(String animalName) {
        for (Animal t : animalList) {
            if (t.getAnimalName().compareTo(animalName) == 0) {
                return t;
            }
        }
        return null;
    }

}
