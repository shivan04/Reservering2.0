package sr.unasat.designpatterns.chainofresponsibility;

import java.io.IOException;

public class app {
    public static void main(String[] args) throws IOException {
        Database database = new Database();
       Handler handler = new UserexistHandler(database)
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());


       AuthService service = new AuthService(handler);
       service.LogIn("shivan01", "shivan02");

    }
}
