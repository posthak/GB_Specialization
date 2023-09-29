package presenter;

import java.time.Instant;

import animal.AnimalForm;
import animal.Animaltype;
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

    public void addAnimal(AnimalForm animalForm, Instant dateOfBirth, String animalName, Animaltype animaltype,
            String command) {
        if (service.addAnimal(animalForm, dateOfBirth, animalName, animaltype, command) == 1) {
            view.print(animalForm + " добавлен!");
        } else {
            view.print("Этот " + animalForm + " уже существует!");
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