package sr.unasat.designpatterns.chainofresponsibility;

public class RoleCheckHandler extends Handler {

    @Override
    public boolean handle (String username,String password){
        if ("shivan01".equals(username)){
            System.out.println("loading admin page ");
            return true;
        }
        System.out.println("loading default Page");
        return handleNext(username, password);
    }
}
