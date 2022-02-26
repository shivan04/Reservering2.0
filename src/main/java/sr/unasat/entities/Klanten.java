package sr.unasat.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Klanten {
    private int klantId;
    private String achternaam;
    private String voornaam;
    private String idNummer;
    private String adress;
    private String district;
    private Integer telefoonNummer;
    private int klantenNummer;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "klanten_nummer")
    private Klanten klanten_nummer;


    @Id
    @Column(name = "klant_id")
    public int getKlantId() {
        return klantId;
    }

    public void setKlantId(int klantId) {
        this.klantId = klantId;
    }

    @Basic
    @Column(name = "Achternaam")
    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    @Basic
    @Column(name = "Voornaam")
    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }



    @Basic
    @Column(name = "adress")
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Basic
    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "telefoon_nummer")
    public Integer getTelefoonNummer() {
        return telefoonNummer;
    }

    public void setTelefoonNummer(Integer telefoonNummer) {
        this.telefoonNummer = telefoonNummer;
    }

    @Basic
    @Column(name = "klanten_nummer")
    public  int getKlantenNummer(){return klantenNummer;}

    public  void  setKlantenNummer(int klantenNummer){
        this.klantenNummer = telefoonNummer;
    }

   @OneToMany( mappedBy = "klanten_nummer", cascade = CascadeType.REMOVE,orphanRemoval = true)
    private List<Klanten>klant;



    @Override
    public String toString() {
        return "KLanten{" +
                "id=" + klantId+
                ", achternaam='" + achternaam + '\'' +
                ", voornaam ='" + voornaam + '\'' +

                ", adress=" + adress +
                ", telefoonnummer =" + telefoonNummer+
                ", klantennummer =" + klantenNummer+
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Klanten klanten = (Klanten) o;

        if (klantId != klanten.klantId) return false;
        if (achternaam != null ? !achternaam.equals(klanten.achternaam) : klanten.achternaam != null) return false;
        if (voornaam != null ? !voornaam.equals(klanten.voornaam) : klanten.voornaam != null) return false;
        if (idNummer != null ? !idNummer.equals(klanten.idNummer) : klanten.idNummer != null) return false;
        if (adress != null ? !adress.equals(klanten.adress) : klanten.adress != null) return false;
        if (district != null ? !district.equals(klanten.district) : klanten.district != null) return false;
        if (telefoonNummer != null ? !telefoonNummer.equals(klanten.telefoonNummer) : klanten.telefoonNummer != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = klantId;
        result = 31 * result + (achternaam != null ? achternaam.hashCode() : 0);
        result = 31 * result + (voornaam != null ? voornaam.hashCode() : 0);
        result = 31 * result + (idNummer != null ? idNummer.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (telefoonNummer != null ? telefoonNummer.hashCode() : 0);
        return result;
    }
}
