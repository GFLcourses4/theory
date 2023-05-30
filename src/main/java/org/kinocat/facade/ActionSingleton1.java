package org.kinocat.facade;

public class ActionSingleton1 {

    private static ActionSingleton1 instance;

    private ActionSingleton1() {

    }

    public static ActionSingleton1 getInstance() {
        if (instance == null) {
            instance = new ActionSingleton1();
        }
        return instance;
    }


    public void writeln() {
        System.out.println("Action 1");
    }
}
