package factory;

/**
 * Factory should create one of two Singleton.
 * Parameters of factory method is a class - interface that is implemented by Singleton.
 */

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new DatabaseAccessFactory();
        DatabaseAccessInterface databaseAccessService = DatabaseAccessService.getInstance();
        DatabaseAccessInterface databaseAccessServiceProxy = abstractFactory.createDatabaseAccessServiceProxy(databaseAccessService);
        test(databaseAccessServiceProxy);
    }
    private static void test(DatabaseAccessInterface object){
        for(int i = 0; i < 2; i++) {
            object.getUserById(1);
            object.getUserById(2);
            object.getUserById(3);
            object.getUserById(4);
        }
    }
}

