package animal;

import java.time.Instant;

public class Donkey extends HomeAnimal {
    public Donkey(Instant dateOfBirth, String animalName, String command) {
        super(AnimalForm.Donkey, dateOfBirth, animalName, Animaltype.packAnimal, command);
        // TODO Auto-generated constructor stub

    }

}