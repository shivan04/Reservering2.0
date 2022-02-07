package sr.unasat.designpatterns.chainofresponsibility;

public class UserexistHandler  extends Handler {
    private Database database;

    public UserexistHandler(Database database){
        this.database = database;
    }
    @Override
    public boolean handle(String username , String password){
        if (!database.isValidUser(username)){
            System.out.println("username not registerd");
            System.out.println("sign up now");
            return false;
        }
        System.out.println("username found");
        return handleNext(username, password);
    }
}
