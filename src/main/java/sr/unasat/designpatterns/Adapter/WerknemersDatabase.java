package sr.unasat.designpatterns.Adapter;

public class WerknemersDatabase extends Werknemer {

        private Integer werknemerId;
        private String achternaam;
        private String voornaam;
        private String adres;
        private String district;
        private Integer telefoonNummer;
        private String idnummer;



    public  WerknemersDatabase (Integer werknemerId, String achternaam, String voornaam,
                              String adres, String district,
                              Integer telefoonNummer, String idnummer) {

        this.werknemerId = werknemerId;
        this.achternaam= achternaam;
        this.voornaam = voornaam;
        this.adres = adres;
        this.district = district;
        this.telefoonNummer = telefoonNummer;
        this.idnummer = idnummer;

    }



        @Override
        Integer getWerknemerId() {
        return this.werknemerId;
    }

        @Override
        String getAchternaam() {
        return this.achternaam;
    }

        @Override
        String getVoornaam() {
        return this.voornaam;
    }

        @Override
        String getAdres() {
        return  this.adres ;
    }

        @Override
        String getDistrrict() {
        return this.district;
    }

        @Override
        Integer getTelefoonnummer() {
        return this.telefoonNummer;
    }

        @Override
        String getIdNummer() {
        return this.idnummer ;
    }

        @Override
        public String toString()
        {
            return "DatabaseWerknemers{" +
                    "id=" + werknemerId +
                    ", acternaam='" + achternaam + '\'' +
                    ", voornaam='" +  voornaam + '\'' +
                    ", adres='" +  adres + '\'' +
                    ", district='" +  district + '\'' +
                    ", telefoonnummer=' "+ telefoonNummer + '\'' +
                    ", Idnummer='" +  idnummer + '\'' +

                    '}';
        }
}
