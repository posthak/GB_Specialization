package ui;

import java.time.Instant;
import java.util.Scanner;

import animal.AnimalForm;
import animal.Animaltype;
import presenter.Presenter;

public class Console implements View {

    private Scanner scanner;
    private Presenter presenter;
    private Menu menu;
    private boolean work;

    @Override
    public void start() {
        menu = new Menu(this);
        work = true;
        while (work) {
            scanner = new Scanner(System.in);
            hello();
            String command = scanner.nextLine();
            if (checkInput(command)) {
                menu.execute(Integer.parseInt(command));
            } else {
                System.out.println("что-то пошло не так");
            }
        }
    }

    private boolean checkInput(String text) {
        return text.matches("[0-9]+");
    }

    private void hello() {
        System.out.println(menu.printMenu());
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    public void finish() {
        work = false;
    }

    public void getListCommand() {

        presenter.getListCommand();
    }

    public void updateCommand() {
        // String animalName;
        // Instant dateOfBirth;
        String command;
        int id;

        System.out.println("Введите Id животного");
        id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите новую команду для животного");
        command = scanner.nextLine();

        presenter.updateCommand(id, command);
        presenter.getAnimalList();
    }

    public void addCat() {
        String animalName;
        // Instant dateOfBirth;
        String command;

        System.out.println("Введите имя животного");
        animalName = scanner.nextLine();

        System.out.println("Введите команду для животного");
        command = scanner.nextLine();

        presenter.addAnimal(AnimalForm.Cat, Instant.now(), animalName, Animaltype.homeAnimal, command);
        presenter.getAnimalList();
    }

    public void addDog() {
        String animalName;
        // Instant dateOfBirth;
        String command;

        System.out.println("Введите имя животного");
        animalName = scanner.nextLine();

        System.out.println("Введите команду для животного");
        command = scanner.nextLine();

        presenter.addAnimal(AnimalForm.Dog, Instant.now(), animalName, Animaltype.homeAnimal, command);
        presenter.getAnimalList();
    }

    public void addHamster() {
        String animalName;
        // Instant dateOfBirth;
        String command;

        System.out.println("Введите имя животного");
        animalName = scanner.nextLine();

        System.out.println("Введите команду для животного");
        command = scanner.nextLine();

        presenter.addAnimal(AnimalForm.Hamster, Instant.now(), animalName, Animaltype.homeAnimal, command);
        presenter.getAnimalList();
    }

    public void addHorse() {
        String animalName;
        // Instant dateOfBirth;
        String command;

        System.out.println("Введите имя животного");
        animalName = scanner.nextLine();

        System.out.println("Введите команду для животного");
        command = scanner.nextLine();

        presenter.addAnimal(AnimalForm.Horse, Instant.now(), animalName, Animaltype.packAnimal, command);
        presenter.getAnimalList();
    }

    public void addCamel() {
        String animalName;
        // Instant dateOfBirth;
        String command;

        System.out.println("Введите имя животного");
        animalName = scanner.nextLine();

        System.out.println("Введите команду для животного");
        command = scanner.nextLine();

        presenter.addAnimal(AnimalForm.Camel, Instant.now(), animalName, Animaltype.packAnimal, command);
        presenter.getAnimalList();
    }

    public void addDonkey() {
        String animalName;
        // Instant dateOfBirth;
        String command;

        System.out.println("Введите имя животного");
        animalName = scanner.nextLine();

        System.out.println("Введите команду для животного");
        command = scanner.nextLine();

        presenter.addAnimal(AnimalForm.Donkey, Instant.now(), animalName, Animaltype.packAnimal, command);
        presenter.getAnimalList();
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
