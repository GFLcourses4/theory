package proxy;

import java.util.HashMap;

public class DatabaseAccessService implements DatabaseAccessInterface{
    private HashMap<Integer, User> users = new HashMap<>();
    @Override
    public User getUserById(Integer id) {
        User user = null;
        for (Integer user_id : users.keySet()) {
            if(user_id.equals(id)){
                user = users.get(user_id);
                System.out.println("User # " + id + ":\n" + user);
            }
        }
        return user;
    }

    public void fillDatabase(){
        users.put(1, new User("ksemeikina", "psRt23_@", 1499070300000L));
        users.put(2, new User("danil1202", "kfgt_645", 1499070300012L));
        users.put(3, new User("sofiia_maksymova", "sof05#7", 1499070300032L));
        users.put(4, new User("yarina_ermolenko", "erMol90", 1499070300050L));
    }
}
