package animal;

import java.time.Instant;

public class Hamster extends HomeAnimal {
    public Hamster(Instant dateOfBirth, String animalName, String command) {
        super(AnimalForm.Hamster, dateOfBirth, animalName, Animaltype.homeAnimal, command);
        // TODO Auto-generated constructor stub

    }

}
