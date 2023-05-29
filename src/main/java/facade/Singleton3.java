package facade;

public class Singleton3 implements Action3{
    private static Singleton3 instance;

    private Singleton3() {
    }

    public static Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }

    @Override
    public void action3() {
        System.out.println("Singleton3 do Action3");
    }
}
