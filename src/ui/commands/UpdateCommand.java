package ui.commands;

import ui.Console;

public class UpdateCommand extends Command {
    public UpdateCommand(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Обучить животное новой команде";
    }

    @Override
    public void execute() {
        getConsole().updateCommand();
    }

}
