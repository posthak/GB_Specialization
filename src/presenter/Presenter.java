package presenter;

import java.time.Instant;

import service.Service;
import ui.View;

public class Presenter {

    private Service service;
    private View view;

    public Presenter(View view) {
        this.view = view;
        this.service = new Service();
        view.setPresenter(this);
    }

    public void getListCommand() {
        view.print(service.getListCommand().toString());
    }

    // public void addAnimal(AnimalForm animalForm, Instant dateOfBirth, String
    // animalName, Animaltype animaltype,
    // String command) {
    // if (service.addAnimal(animalForm, dateOfBirth, animalName, animaltype,
    // command) == 1) {
    // view.print(animalForm + " добавлен!");
    // } else {
    // view.print("Этот " + animalForm + " уже существует!");
    // }
    // }

    public void addCat(Instant dateOfBirth, String animalName, String command) {
        if (service.addCat(dateOfBirth, animalName, command) == 1) {
            view.print("Cat добавлен!");
        } else {
            view.print("Этот Cat уже существует!");
        }
    }

    public void addDog(Instant dateOfBirth, String animalName, String command) {
        if (service.addDog(dateOfBirth, animalName, command) == 1) {
            view.print("Dog добавлен!");
        } else {
            view.print("Этот Dog уже существует!");
        }
    }

    public void addHamster(Instant dateOfBirth, String animalName, String command) {
        if (service.addHamster(dateOfBirth, animalName, command) == 1) {
            view.print("Hamster добавлен!");
        } else {
            view.print("Этот Hamster уже существует!");
        }
    }

    public void addCamel(Instant dateOfBirth, String animalName, String command) {
        if (service.addCamel(dateOfBirth, animalName, command) == 1) {
            view.print("Camel добавлен!");
        } else {
            view.print("Этот Camel уже существует!");
        }
    }

    public void addHorse(Instant dateOfBirth, String animalName, String command) {
        if (service.addHorse(dateOfBirth, animalName, command) == 1) {
            view.print("Horse добавлен!");
        } else {
            view.print("Этот Horse уже существует!");
        }
    }

    public void addDonkey(Instant dateOfBirth, String animalName, String command) {
        if (service.addDonkey(dateOfBirth, animalName, command) == 1) {
            view.print("Donkey добавлен!");
        } else {
            view.print("Этот Donkey уже существует!");
        }
    }

    public void updateCommand(int id, String command) {
        if (service.updateCommand(id, command) == 1) {
            view.print("Животное обучено новой команде!");
        } else {
            view.print("Id животного не существует!");
        }
    }

    public void getAnimalList() {
        view.print(service.getAnimalList().toString());
    }

}