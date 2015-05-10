package in.zerob13.motoxtools.RootUtils;

import java.util.ArrayList;

/**
 * Created by zerob13 on 5/10/15.
 */
public class Command {
    private String mCommand;
    private ArrayList<String> args;

    public Command() {
        mCommand = "";
        args = new ArrayList<String>();
    }

    public Command(String aCommand, String[] aArgs) {
        this();
        for (int i = 0; i < aArgs.length; i++) {
            args.add(aArgs[i]);
        }
        mCommand = aCommand;
    }

    public Command(String aCommand, String aArg) {
        this();
        args.add(aArg);
        mCommand = aCommand;
    }

    public String getCommandLine() {
        StringBuffer result = new StringBuffer();
        result.append(mCommand);
        if (args.size() > 0) {
            for (int i = 0; i < args.size(); i++) {
                result.append(" ");
                result.append(args.get(i));
            }
        }
        return result.toString();
    }
}
