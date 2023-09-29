package animal;

import java.time.Instant;

public class Horse extends HomeAnimal {
    public Horse(Instant dateOfBirth, String animalName, String command) {
        super(AnimalForm.Horse, dateOfBirth, animalName, Animaltype.packAnimal, command);
        // TODO Auto-generated constructor stub

    }

}
