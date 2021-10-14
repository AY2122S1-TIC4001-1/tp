package seedu.duke.command;

import seedu.duke.NusModList;
import seedu.duke.Ui;
import seedu.duke.UserList;

public class DeleteCommand extends Command {

    public DeleteCommand(String userInstruction) {
        super(userInstruction);
    }

    @Override
    public void execute(UserList myModules, Ui ui, NusModList allModules) {
        myModules.deleteModule(userInstruction);
    }
}
