package sr.unasat.designpatterns.chainofresponsibility;

public class AuthService {
    private Handler handler;
    public AuthService(Handler handler){
        this.handler = handler;
    }

    public boolean LogIn (String username, String password){
        if (handler.handle(username,password)){
            System.out.println( "Autho was susccesful");
            return true;
        }
        return false;
    }
}
