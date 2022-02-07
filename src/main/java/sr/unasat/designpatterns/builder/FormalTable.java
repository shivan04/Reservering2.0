package sr.unasat.designpatterns.builder;

import java.util.ArrayList;
import java.util.Collections;

public class FormalTable extends TableBuilder {
    public void buildSetting(){
        table.setSetting("Formal");
    }

    public void buildFeatures(){
        ArrayList<String> features = new ArrayList<String>();
        Collections.addAll(features, "Water glas", "Red Wine Glas","White Wine Glas","Cup and Saucer",
                "Serving Plate", "Bread Plate","Butter spreader","salad Fork", "Dinner Fork","Dinner Knife","Salad Knife"
                ,"Soup Spoon","Tea Spoon","Napkin");
        table.setFeatures(features);
    }
}
