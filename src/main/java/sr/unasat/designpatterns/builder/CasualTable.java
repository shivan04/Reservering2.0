package sr.unasat.designpatterns.builder;

import java.util.ArrayList;
import java.util.Collections;

public class CasualTable extends TableBuilder {
    public void buildSetting(){
        table.setSetting("Casual");
    }

    public void buildFeatures(){
        ArrayList<String> features = new ArrayList<String>();
        Collections.addAll(features, "Water glas", "Wine Glas",
                "Serving Plate", "Bread Plate","Butter spreader","salad Fork", "Dinner Fork","Dinner Knife","Soup Spoon","Tea Spoon","Napkin");
        table.setFeatures(features);
    }
}
