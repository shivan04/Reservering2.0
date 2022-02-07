package sr.unasat.designpatterns.builder;

public  abstract class TableBuilder    {
    protected Table table;

    public Table getTable(){
        return table;
    }

    public void createNewTable(){
        table = new Table();
    }

    public abstract void buildSetting();
    public abstract void buildFeatures();

}
