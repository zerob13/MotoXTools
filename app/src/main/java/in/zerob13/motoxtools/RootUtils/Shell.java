package in.zerob13.motoxtools.RootUtils;

import java.util.ArrayList;

/**
 * Created by zerob13 on 5/10/15.
 */
public class Shell {
    private ArrayList<Command> mCommands;

    public Shell() {
        mCommands = new ArrayList<Command>();
    }

    public Shell(Command[] aCommands) {
        this();
        for (int i = 0; i < aCommands.length; i++) {
            mCommands.add(aCommands[i]);
        }
    }

}
