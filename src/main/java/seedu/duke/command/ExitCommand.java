package seedu.duke.command;

import seedu.duke.NusModList;
import seedu.duke.Ui;
import seedu.duke.UserList;

public class ExitCommand extends Command {

    @Override
    public void execute(UserList myModules, Ui ui, NusModList allModules) {
    }

    public static boolean isExit(Command command) {
        return command instanceof ExitCommand; // instanceof returns false if it is null
    }

}
