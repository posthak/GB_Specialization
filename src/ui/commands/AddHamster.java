package ui.commands;

import ui.Console;

public class AddHamster extends Command {
    public AddHamster(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Добавить hamster";
    }

    @Override
    public void execute() {
        getConsole().addHamster();
    }

}
