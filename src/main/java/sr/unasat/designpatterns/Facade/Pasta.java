package sr.unasat.designpatterns.Facade;

public class Pasta implements Food {
 public String PreparedItem;

    @Override
    public void prepareFood(String itemsRequird) {
        // in the making
        PreparedItem = " alfredo pasta with ingredients "+ itemsRequird;
    }

    @Override
    public String deliverFood() {
        return PreparedItem;
    }
}
