package sr.unasat.designpatterns.builder;

public class RestaurantWorkers  {
    private TableBuilder tableBuilder;

    public void setTableBuilder(TableBuilder tableBuilder){
        this.tableBuilder = tableBuilder;
    }

    public TableBuilder getTableBuilder(){
        return tableBuilder;
    }

    public Table getTable(){
        return tableBuilder.getTable();
    }

    public void constructtable(){
        tableBuilder.createNewTable();
        tableBuilder.buildSetting();
        tableBuilder.buildFeatures();
    }
}
