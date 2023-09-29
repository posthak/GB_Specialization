package ui;

import java.util.ArrayList;
import java.util.List;

import ui.commands.AddCamel;
import ui.commands.AddCat;
import ui.commands.AddDog;
import ui.commands.AddDonkey;
import ui.commands.AddHamster;
import ui.commands.AddHorse;
import ui.commands.Exit;
import ui.commands.GetListCommand;
import ui.commands.Option;
import ui.commands.ShowAnimal;
import ui.commands.UpdateCommand;

public class Menu {
    private List<Option> commands;

    public Menu(Console console) {
        commands = new ArrayList<>();
        commands.add(new AddCat(console));
        commands.add(new AddHamster(console));
        commands.add(new AddDog(console));
        commands.add(new AddCamel(console));
        commands.add(new AddHorse(console));
        commands.add(new AddDonkey(console));
        commands.add(new GetListCommand(console));
        commands.add(new UpdateCommand(console));
        commands.add(new ShowAnimal(console));
        commands.add(new Exit(console));
    }

    void execute(int num) {
        Option option = commands.get(num - 1);
        option.execute();
    }

    public String printMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(": ");
            stringBuilder.append(commands.get(i).description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
