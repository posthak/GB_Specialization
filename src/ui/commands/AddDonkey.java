package ui.commands;

import ui.Console;

public class AddDonkey extends Command {
    public AddDonkey(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Добавить donkey";
    }

    @Override
    public void execute() {
        getConsole().addDonkey();
    }

}
