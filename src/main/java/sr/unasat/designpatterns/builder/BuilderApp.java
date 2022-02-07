package sr.unasat.designpatterns.builder;

public class BuilderApp {

    public static void main(String[] args) {
  RestaurantWorkers restaurantWorkers = new RestaurantWorkers();
        System.out.println("Welke Setting wilt u hebben voor de Dineetje?");

        TableBuilder basicTable = new BasicTable();
        TableBuilder  casualTable = new CasualTable();
        TableBuilder  formalTable = new FormalTable();

        System.out.println("Groot: I am Groot.");
        System.out.println("Vision: Casual Setting.");
        System.out.println("Thanos: Formal Setting.");

        restaurantWorkers.setTableBuilder(basicTable);
        restaurantWorkers.constructtable();
       Table table = restaurantWorkers.getTable();
        System.out.println("\n  Groot You're " + table.getSetting() +"table is ready"+
                "\n- Featuring: " + table.getFeatures());



        restaurantWorkers.setTableBuilder(casualTable);
        restaurantWorkers.constructtable();
      Table table1 = restaurantWorkers.getTable();
        System.out.println("\n  Vision You're " + table1.getSetting() +"table is ready"+
                "\n- Featuring: " + table1.getFeatures());





        restaurantWorkers.setTableBuilder(formalTable);
        restaurantWorkers.constructtable();
        Table table2 = restaurantWorkers.getTable();
        System.out.println("\n  Thanos You're " + table2.getSetting() +"table is ready"+
                "\n- Featuring: " + table2.getFeatures());
    }
}
