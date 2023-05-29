package facade;

/**
 * Create several Singleton and call him in the current facade.
 * Every Singleton write in the console System.out.println("Action 1"),
 * System.out.println("Action 2") etc.
 */
public class Main {
    public static void main(String[] args) {
        ActionFacade facade = new ActionFacade();
        facade.actions();
    }
}
