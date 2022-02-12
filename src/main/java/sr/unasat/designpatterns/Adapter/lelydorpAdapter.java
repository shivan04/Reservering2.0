package sr.unasat.designpatterns.Adapter;

public class lelydorpAdapter extends Werknemer{
    private  LelydorpWerknemers lelydorpWerknemers;


    public lelydorpAdapter(LelydorpWerknemers lelydorpWerknemers){
        this.lelydorpWerknemers = lelydorpWerknemers;
    }


    @Override
   public Integer getWerknemerId() {
        return lelydorpWerknemers.getWerknemerId();
    }

    @Override
    String getAchternaam() {
        return lelydorpWerknemers.getAchternaam();
    }

    @Override
    String getVoornaam() {
        return lelydorpWerknemers.getVoornaam();
    }

    @Override
    String getAdres() {
        return lelydorpWerknemers.getAdres();
    }

    @Override
    String getDistrrict() {
        return lelydorpWerknemers.getDistrict();
    }

    @Override
    Integer getTelefoonnummer() {
        return lelydorpWerknemers.getTelefoonNummer();
    }

    @Override
    String getIdNummer() {
        return lelydorpWerknemers.getIdnummer();
    }



}
