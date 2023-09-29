
package ui.commands;

import ui.Console;

public class ShowAnimal extends Command {
    public ShowAnimal(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Показать всех животных";
    }

    @Override
    public void execute() {
        getConsole().showAnimal();
    }

}
