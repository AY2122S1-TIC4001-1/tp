package seedu.duke.command;

import seedu.duke.NusModList;
import seedu.duke.Ui;
import seedu.duke.UserList;

public abstract class Command {

    protected String userInstruction;

    public Command() {

    }

    public Command(String userInstruction) {
        this.userInstruction = userInstruction;
    }

    public void execute(UserList myModules, Ui ui, NusModList allModules) {
        throw new UnsupportedOperationException("This method is to be implemented by child classes");
    }

}
