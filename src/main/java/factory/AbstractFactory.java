package factory;

public interface AbstractFactory {
    DatabaseAccessInterface createDatabaseAccessServiceProxy(DatabaseAccessInterface databaseAccessService);
}
