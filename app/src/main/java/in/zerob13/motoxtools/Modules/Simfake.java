package in.zerob13.motoxtools.Modules;

import in.zerob13.motoxtools.RootUtils.Command;
import in.zerob13.motoxtools.RootUtils.Shell;

/**
 * Created by zerob13 on 5/10/15.
 */
public class Simfake {
    private static final String COMMAND_PREFIX = "setprop";
    private static final String[] PROPERTIES = {"gsm.sim.operator.numeric \"310004\"", "gsm.sim.operator.iso-country \"us\"", "gsm.sim.operator.alpha \"Verizon\""};
    public static void fakeSim(){
        Shell rootShell=new Shell();
        for(String pro:PROPERTIES) {
            Command command = new Command(COMMAND_PREFIX, pro);
            rootShell.addCommand(command);
        }
     rootShell.execute();

    }

}
