package in.zerob13.motoxtools.RootUtils;

import android.util.Log;

import java.io.DataOutputStream;
import java.io.IOException;
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

    public void addCommand(Command aCommand) {
        mCommands.add(aCommand);
    }

    private Process getRootProcess() {
        try {
            return Runtime.getRuntime().exec("su");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void execute() {
        execute(0);
    }

    public void execute(long timeout) {
        Process rootP = getRootProcess();
        if (rootP == null) {
            Log.e("MotoXTools", "No Root permissions!");
        }
        DataOutputStream os = new DataOutputStream(rootP.getOutputStream());
        try {
            for (int i = 0; i < mCommands.size(); i++) {
                os.writeBytes(mCommands.get(i).getCommandLine());
                os.writeBytes("\n");
            }
            os.writeBytes("exit\n");
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
