package sr.unasat.designpatterns.Facade;

public class Pizza implements Food{
    public String preparedItem;
    @Override
    public void prepareFood(String itemsRequird) {
// in the making
        preparedItem = " thin crust pizza with ingredients "+ itemsRequird;
    }

    @Override
    public String deliverFood() {
        return preparedItem;
    }
}
