package sr.unasat.designpatterns.chainofresponsibility;



public abstract class Handler {
    private Handler next;
    public Handler setNextHandler(Handler next){

        this.next= next;
        return next;
    }

    public abstract boolean handle (String username , String password);

    protected boolean handleNext(String username , String passsword){
        if (next==null){
            return true;
        }
        return next.handle(username, passsword);
    }


}
