package ui.commands;

import ui.Console;

public class AddCamel extends Command {
    public AddCamel(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Добавить camel";
    }

    @Override
    public void execute() {
        getConsole().addCamel();
    }

}
