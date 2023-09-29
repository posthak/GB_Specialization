package ui.commands;

import ui.Console;

public class AddDog extends Command {
    public AddDog(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Добавить dog";
    }

    @Override
    public void execute() {
        getConsole().addDog();
    }

}
