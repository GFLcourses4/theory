package proxy;

/**
 * Proxy over an implemented interface with one method
 * that prints the method's parameters to the console.
 */

public class Main {
    public static void main(String[] args) {
        DatabaseAccessService databaseService = new DatabaseAccessService();
        DatabaseAccessServiceProxy databaseServiceProxy = new DatabaseAccessServiceProxy(databaseService);
        databaseService.fillDatabase();

        System.out.println("==========Work with service:==========");
        test(databaseService);

        System.out.println();

        System.out.println("==========Work with proxy:==========");
        test(databaseServiceProxy);
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
