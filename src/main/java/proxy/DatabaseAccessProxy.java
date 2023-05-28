package proxy;

import java.util.HashMap;

public class DatabaseAccessProxy implements DatabaseAccessInterface{
    private final DatabaseAccessService databaseAccessService;
    private HashMap<Integer, User> cache = new HashMap<>();

    public DatabaseAccessProxy(DatabaseAccessService databaseAccessService){
        this.databaseAccessService = databaseAccessService;
    }

    @Override
    public User getUserById(Integer id) {
        User user = cache.get(id);
        if(user != null){
            System.out.println("User # " + id + " from cache:\n" + user);
        }
        if (user == null) {
            user = databaseAccessService.getUserById(id);
            if(user != null){
                cache.put(id, user);
            }
        }
        return user;
    }

    public void reset() {
        cache.clear();
    }
}
