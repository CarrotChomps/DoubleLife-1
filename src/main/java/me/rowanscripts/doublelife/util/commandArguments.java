package me.rowanscripts.doublelife.util;

import java.util.ArrayList;
import java.util.List;

public class commandArguments {

    public static List<String> getAdministrativeCommands() {
        List<String> arguments = new ArrayList<>();
        arguments.add("clearPlayData");
        arguments.add("deleteFiles");
        arguments.add("restartWorld");
        return arguments;
    }

}
