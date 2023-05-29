package factory;

public class DatabaseAccessFactory implements AbstractFactory{
    @Override
    public DatabaseAccessInterface createDatabaseAccessServiceProxy(DatabaseAccessInterface databaseAccessService) {
        return DatabaseAccessServiceProxy.getInstance((DatabaseAccessService) databaseAccessService);
    }
}
