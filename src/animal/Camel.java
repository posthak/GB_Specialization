package animal;

import java.time.Instant;

public class Camel extends HomeAnimal {
    public Camel(Instant dateOfBirth, String animalName, String command) {
        super(AnimalForm.Camel, dateOfBirth, animalName, Animaltype.packAnimal, command);
        // TODO Auto-generated constructor stub

    }

}