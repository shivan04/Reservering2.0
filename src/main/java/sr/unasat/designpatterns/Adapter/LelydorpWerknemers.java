package sr.unasat.designpatterns.Adapter;

public class LelydorpWerknemers {
    private Integer werknemerIds;
    private String achternaaml;
    private String Voornaaml;
    private String Adresl;
    private String Districtl;
    private Integer telefoonNummerl;
    private String Idnummerl;



    public  LelydorpWerknemers(int werknemerIdl, String achternaaml, String voornaaml,
                                   String adresl, String districtl,
                                   int telefoonNummerl, String idnummerl){

        this.werknemerIds = werknemerIdl;
        this.achternaaml= achternaaml;
        this.Voornaaml = voornaaml;
        this.Adresl = adresl;
        this.Districtl = districtl;
        this.telefoonNummerl = telefoonNummerl;
        this.Idnummerl = idnummerl;

    }
    public Integer getWerknemerId() {
        return werknemerIds;
    }

    public void setWerknemerId(Integer werknemerId) {
        this.werknemerIds = werknemerId;
    }

    public String getAchternaam() {
        return achternaaml;
    }

    public void setAchternaam(String achternaam) {
        this.achternaaml = achternaam;
    }

    public String getVoornaam() {
        return Voornaaml;
    }

    public void setVoornaam(String voornaam) {
        this.Voornaaml = voornaam;
    }

    public String getAdres() {
        return Adresl;
    }

    public void setAdress(String adress) {
        this.Adresl = Adresl;
    }
    public String getDistrict() {
        return Districtl;
    }

    public void setDistrict(String district) {
        this.Districtl = district;
    }

    public Integer getTelefoonNummer() {
        return telefoonNummerl;
    }

    public void setTelefoonNummer(Integer telefoonNummer) {
       this.telefoonNummerl = telefoonNummer;
    }
    public String getIdnummer () {
        return Idnummerl;
    }

    public void setIdnummer(String idnummer) {
        this.Idnummerl = idnummer;
    }
    @Override
    public String toString()
    {
        return "DatabaseWerknemers{" +
                "id=" + werknemerIds +
                ", acternaam='" + achternaaml + '\'' +
                ", voornaam='" +  Voornaaml + '\'' +
                ", adres='" +  Adresl + '\'' +
                ", district='" +  Districtl + '\'' +
                ", telefoonnummer=' "+ telefoonNummerl + '\'' +
                ", Idnummer='" +  Idnummerl + '\'' +

                '}';
    }



}
