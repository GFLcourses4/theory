package facade;

public class ActionFacade implements Action{
    private final Singleton1 singleton1;
    private final Singleton2 singleton2;
    private final Singleton3 singleton3;

    public ActionFacade() {
        singleton1 = Singleton1.getInstance();
        singleton2 = Singleton2.getInstance();
        singleton3 = Singleton3.getInstance();
    }

    @Override
    public void actions(){
        singleton1.action1();
        singleton2.action2();
        singleton3.action3();
    }
}
