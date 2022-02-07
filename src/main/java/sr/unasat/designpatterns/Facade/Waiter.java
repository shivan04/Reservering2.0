package sr.unasat.designpatterns.Facade;

public class Waiter { // facade omdat de waiter alle implementaties.
    public static String deliverFood(FoodType foodType) {
        Ingredient ingredient = new Ingredient();

        switch (foodType) {
            case pasta:
                Food pasta = new Pasta();
                String PastaItems = ingredient.getPastaItems();
                pasta.prepareFood(PastaItems);
                return (pasta.deliverFood());

            case pizza:
                Food pizza = new Pizza();
                String PizzaItems = ingredient.getPizzaItems();
                pizza.prepareFood(PizzaItems);
                return (pizza.deliverFood());
        }
        return null;


    }
}
