package sr.unasat.designpatterns.builder;

import java.util.ArrayList;
import java.util.Collections;

public class BasicTable extends TableBuilder {
    public void buildSetting(){
        table.setSetting("Basic");
    }

    public void buildFeatures(){
        ArrayList<String> features = new ArrayList<String>();
        Collections.addAll(features, "glas", "plate", "spoon", "fork", "napkin");
        table.setFeatures(features);
    }


}
