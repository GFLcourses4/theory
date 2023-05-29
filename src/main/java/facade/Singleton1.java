package facade;

public class Singleton1 implements Action1{
    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }

    @Override
    public void action1() {
        System.out.println("Singleton1 do Action1");
    }
}
