package ui.commands;

import ui.Console;

public class AddHorse extends Command {
    public AddHorse(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Добавить horse";
    }

    @Override
    public void execute() {
        getConsole().addHorse();
    }

}
