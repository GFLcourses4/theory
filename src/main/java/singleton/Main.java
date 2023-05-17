package singleton;

public class Main {
    public static void main(String[] args) {
        UserLazyInitialization singleton = UserLazyInitialization.getInstance("ksemeikina", "psRt23_@", 1499070300000L);
        System.out.println(singleton);
    }
}
