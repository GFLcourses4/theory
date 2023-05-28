package proxy;

/**
 * Proxy over an implemented interface with one method
 * that prints the method's parameters to the console.
 */

public class Main {
    public static void main(String[] args) {
        DatabaseAccessService databaseService = new DatabaseAccessService();
        DatabaseAccessProxy databaseServiceProxy = new DatabaseAccessProxy(databaseService);
        databaseService.fillDatabase();

        System.out.println("==========Work with service:==========");
        databaseService.getUserById(1);
        databaseService.getUserById(1);
        databaseService.getUserById(2);
        databaseService.getUserById(2);
        databaseService.getUserById(3);
        databaseService.getUserById(3);
        databaseService.getUserById(4);
        databaseService.getUserById(4);

        System.out.println();

        System.out.println("==========Work with proxy:==========");
        databaseServiceProxy.getUserById(1);
        databaseServiceProxy.getUserById(1);
        databaseServiceProxy.getUserById(2);
        databaseServiceProxy.getUserById(2);
        databaseServiceProxy.getUserById(3);
        databaseServiceProxy.getUserById(3);
        databaseServiceProxy.getUserById(4);
        databaseServiceProxy.getUserById(4);
    }
}
