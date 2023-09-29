package animal;

import java.time.Instant;

public class Cat extends HomeAnimal {
    public Cat(Instant dateOfBirth, String animalName, String command) {
        super(AnimalForm.Cat, dateOfBirth, animalName, Animaltype.homeAnimal, command);
        // TODO Auto-generated constructor stub

    }

}
