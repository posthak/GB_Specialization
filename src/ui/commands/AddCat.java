package ui.commands;

import ui.Console;

public class AddCat extends Command {
    public AddCat(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Добавить cat";
    }

    @Override
    public void execute() {
        getConsole().addCat();
    }

}
