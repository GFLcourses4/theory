package org.kinocat.facade;

public class ActionPrinterFacade implements ActionFacade {

    private final ActionSingleton1 actionSingleton1;
    private final ActionSingleton2 actionSingleton2;

    public ActionPrinterFacade(ActionSingleton1 actionSingleton1, ActionSingleton2 actionSingleton2) {
        this.actionSingleton1 = actionSingleton1;
        this.actionSingleton2 = actionSingleton2;
    }

    @Override
    public void printActions() {
        actionSingleton1.writeln();
        actionSingleton2.writeln();
    }
}
