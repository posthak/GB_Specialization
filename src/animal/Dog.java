package animal;

import java.time.Instant;

public class Dog extends HomeAnimal {
    public Dog(Instant dateOfBirth, String animalName, String command) {
        super(AnimalForm.Dog, dateOfBirth, animalName, Animaltype.homeAnimal, command);
        // TODO Auto-generated constructor stub

    }

}