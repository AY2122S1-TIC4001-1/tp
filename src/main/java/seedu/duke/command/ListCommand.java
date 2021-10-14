package seedu.duke.command;

import seedu.duke.NusModList;
import seedu.duke.Ui;
import seedu.duke.UserList;

public class ListCommand extends Command {

    public ListCommand(String userInstruction) {
        super(userInstruction);
    }

    @Override
    public void execute(UserList myModules, Ui ui, NusModList allModules) {
        System.out.println("Do " + userInstruction);

        // Refactor into UI Class
        // Get Data
        allModules = allModules.sharedInstance();

        //List and Format Data - List 15 Modules tbc
        System.out.println("Here are the list of available Modules (Limit to 10) : ");
        for (int i = 0; i < 15; i++) {
            System.out.println(allModules.getMod(i).getModuleCode() + " | "
                                + allModules.getMod(i).getModuleTitle());
        }

        System.out.println("Data was retrieved using NUS MODS API.");
    }
}