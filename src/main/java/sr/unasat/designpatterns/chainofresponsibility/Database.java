package sr.unasat.designpatterns.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private final Map<String, String> users;
    public Database(){
        users = new HashMap<>();
        users.put("admin_username", "admin_password");
        users.put ("shivan01", "shivan02");

    }

    public Boolean isValidUser(String username){
        return users.containsKey(username);
    }
    public  Boolean isValidPassword(String password){
        return users.get(users).equals(password);
    }

}
