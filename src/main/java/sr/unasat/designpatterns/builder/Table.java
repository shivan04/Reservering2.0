package sr.unasat.designpatterns.builder;

import java.util.ArrayList;

public class Table {
    private String Setting = "";
    private ArrayList<String> features = new ArrayList<>();

    public void setSetting(String setting){
        this.Setting=setting;
    }
    public void setFeatures(ArrayList<String> features){
        this.features = features;
    }

    public String getSetting(){
        return Setting;
    }
    public ArrayList<String>getFeatures(){
        return features;
    }
}
