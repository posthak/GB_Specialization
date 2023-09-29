package ui.commands;

import ui.Console;

public class GetListCommand extends Command {
    public GetListCommand(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Получить список команд животных";
    }

    @Override
    public void execute() {
        getConsole().getListCommand();
    }

}