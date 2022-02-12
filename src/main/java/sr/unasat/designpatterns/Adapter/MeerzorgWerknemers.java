package sr.unasat.designpatterns.Adapter;

public class MeerzorgWerknemers {

    private Integer werknemerIdm;
    private String achternaamm;
    private String Voornaamm;
    private String Adresm;
    private String Districtm;
    private Integer telefoonNummerm;
    private String Idnummerm;

    public MeerzorgWerknemers(Integer werknemerIdm, String achternaamm, String voornaamm,
                                   String adresm, String districtm,
                                   Integer telefoonNummerm, String idnummerm){

        this.werknemerIdm = werknemerIdm;
        this.achternaamm= achternaamm;
        this.Voornaamm = voornaamm;
        this.Adresm = adresm;
        this.Districtm = districtm;
        this.telefoonNummerm = telefoonNummerm;
        this.Idnummerm = idnummerm;

    }
    public Integer getWerknemerId() {
        return werknemerIdm;
    }

    public void setWerknemerId(Integer werknemerId) {
        this.werknemerIdm= werknemerId;
    }

    public String getAchternaam() {
        return achternaamm;
    }

    public void setAchternaam(String achternaam) {
        this.achternaamm = achternaam;
    }

    public String getVoornaam() {
        return Voornaamm;
    }

    public void setVoornaam(String voornaam) {
        this.Voornaamm= voornaam;
    }

    public String getAdres() {
        return Adresm;
    }

    public void setAdress(String adress) {
        this.Adresm = Adresm;
    }
    public String getDistrict() {
        return Districtm;
    }

    public void setDistrict(String district) {
        this.Districtm = district;
    }

    public Integer getTelefoonNummer() {
        return telefoonNummerm;
    }

    public void setTelefoonNummer(Integer telefoonNummer) {
        this.telefoonNummerm = telefoonNummer;
    }
    public String getIdnummer () {
        return Idnummerm;
    }

    public void setIdnummer(String idnummer) {
        this.Idnummerm = idnummer;
    }
    @Override
    public String toString()
    {
        return "DatabaseWerknemers{" +
                "id=" + werknemerIdm +
                ", acternaam='" + achternaamm + '\'' +
                ", voornaam='" +  Voornaamm + '\'' +
                ", adres='" +  Adresm + '\'' +
                ", district='" +  Districtm + '\'' +
                ", telefoonnummer=' "+ telefoonNummerm + '\'' +
                ", Idnummer='" +  Idnummerm + '\'' +

                '}';
    }
}
