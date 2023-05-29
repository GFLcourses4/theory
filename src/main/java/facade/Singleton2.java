package facade;

public class Singleton2 implements Action2{
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }

    @Override
    public void action2() {
        System.out.println("Singleton2 do Action2");
    }
}
