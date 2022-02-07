package sr.unasat.designpatterns.Facade;

public class Customer {
    public static void main(String[] args) {
        /*
       Ingredient ingredient= new Ingredient();

       Food pasta = new Pasta();
       String PastaItems = ingredient.getPastaItems();
       pasta.prepareFood(PastaItems);
        System.out.println(pasta.deliverFood());

        Food pizza = new Pizza();
        String PizzaItems = ingredient.getPastaItems();
        pasta.prepareFood(PizzaItems);
        System.out.println(pizza.deliverFood());


         */


        // facade
        System.out.println("------facade------");
        System.out.println(Waiter.deliverFood(FoodType.pasta));
        System.out.println(Waiter.deliverFood(FoodType.pizza));
        System.out.println(Waiter.deliverFood(FoodType.pasta));

    }
}
