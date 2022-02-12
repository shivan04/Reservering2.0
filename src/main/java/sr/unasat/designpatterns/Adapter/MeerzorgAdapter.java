package sr.unasat.designpatterns.Adapter;

public class MeerzorgAdapter extends Werknemer {
    private MeerzorgWerknemers meerzorgWerknemers;


    public MeerzorgAdapter(MeerzorgWerknemers meerzorgWerknemers){
        this.meerzorgWerknemers = meerzorgWerknemers;
    }


    @Override
    public Integer getWerknemerId() {
        return meerzorgWerknemers.getWerknemerId();
    }

    @Override
    String getAchternaam() {
        return meerzorgWerknemers.getAchternaam();
    }

    @Override
    String getVoornaam() {
        return meerzorgWerknemers.getVoornaam();
    }

    @Override
    String getAdres() {
        return meerzorgWerknemers.getAdres();
    }

    @Override
    String getDistrrict() {
        return meerzorgWerknemers.getDistrict();
    }

    @Override
    Integer getTelefoonnummer() {
        return meerzorgWerknemers.getTelefoonNummer();
    }

    @Override
    String getIdNummer() {
        return meerzorgWerknemers.getIdnummer();
    }


}
