package sr.unasat.aplication;

import org.w3c.dom.ls.LSOutput;
import sr.unasat.config.JPAconfig;
import sr.unasat.dao.*;
import sr.unasat.entities.Klanten;
import sr.unasat.entities.Reservation;
import sr.unasat.entities.Tafels;
import sr.unasat.entities.Werknemer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class App {

    public static void main(String[] args) {
        JPAconfig.getEntityManager();
        TafelsDao tafelsDao = new TafelsDao(JPAconfig.getEntityManager());
        ReservationDao reservationDao = new ReservationDao(JPAconfig.getEntityManager());
        KlantDao klantDao = new KlantDao(JPAconfig.getEntityManager());
        WerknemerDao werknemerDao = new WerknemerDao(JPAconfig.getEntityManager());
        LocationDao locationDao = new LocationDao(JPAconfig.getEntityManager());


        int foundDeletedReservation= klantDao.delete(3);

        System.out.println(foundDeletedReservation);

        JPAconfig.shutdown();




/*
        Werknemer foundWerknemer = WerknemerDao.findByWerknemerNummer(5);  //select where
        foundWerknemer.setAdress("Hulkstraat 50");
        int updatedRecords = werknemerDao.updateWerknemer(foundWerknemer);
        System.out.println(updatedRecords);
        System.out.println(foundWerknemer);


 */

        //klanten

        // insert/
/*
   Klanten klanten = Klanten.builder().achternaam("bamma").voornaam("peter").idNummer("mGH112").
                adress("rikhaiweg").district("wanica").telefoonNummer(77455896).klantenNummer(20).build();
        Klanten savedCompany = KlantDao.insert(klanten);
        System.out.println(savedCompany);



 */



// delete
/*
 int foundDeletedReservation= klantDao.delete(10);

        System.out.println(foundDeletedReservation);

        JPAconfig.shutdown();




 */

        // list

        //    List<Klanten>  klantenList = KlantDao.retrieveKlantenList();
        //  klantenList.stream().forEach(System.out::println);
        //for (Klanten klanten : klantenList) {
        // System.out.println(klantenList);


        //update

/*
             Klanten foundKlanten = KlantDao.findByklantNummer(2);  //select where
        foundKlanten.setAdress("Hulkstraat 51");
        int updatedRecords = KlantDao.updateKlanten(foundKlanten);
        System.out.println(updatedRecords);
        System.out.println(foundKlanten);


 */


// werknemer
        /*
        Werknemer werknemer = Werknemer.builder().achternaam("Dessa").voornaam("peter").idNummer("mGH112").
                adress("rikhaiweg").district("wanica").telefoonNummer(77455896).build();
        Werknemer savedwerknemr = WerknemerDao.insert(werknemer);
        System.out.println(savedwerknemr);

// delete
        int foundDeletedWerknemer= WerknemerDao.delete(3);

        System.out.println(foundDeletedWerknemer);

        JPAconfig.shutdown();
        // list
        List<Werknemer>  WerknemerList = WerknemerDao.retrieveWerknemerList();
        WerknemerList.stream().forEach(System.out::println);
      //  for (Werknemer werknemer : WerknemerList) {
        //    System.out.println(WerknemerList);
        }
//update

         */


    }
}


