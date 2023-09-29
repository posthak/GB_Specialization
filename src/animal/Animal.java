
package animal;

import java.time.Instant;

public class Animal {
    private int id;
    private AnimalForm animalForm;
    private Instant dateOfBirth;
    private String animalName;
    private Animaltype animalType;
    private String command;

    public Animal(AnimalForm animalForm, Instant dateOfBirth, String animalName, Animaltype animalType,
            String command) {
        this.id = Counter.add();
        this.animalForm = animalForm;
        this.animalName = animalName;
        this.animalType = animalType;
        this.dateOfBirth = dateOfBirth;
        this.command = command;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Integer getId() {
        return id;
    }

    public Animaltype getAnimalType() {
        return animalType;
    }

    @Override
    public String toString() {
        return "Animal{" + "\n" +
                ", AnimalForm='" + animalForm + '\'' +
                ", Id='" + id + '\'' +
                ", AnimalName='" + animalName + '\'' +
                ", DateOfBirth='" + dateOfBirth + '\'' +
                ", Command='" + command + '\'' +
                ", AnimalType=" + animalType +
                '}' + "\n";
    }

}