package sr.unasat.aplication;

import org.w3c.dom.ls.LSOutput;
import sr.unasat.config.JPAconfig;
import sr.unasat.dao.*;
import sr.unasat.entities.Klanten;
import sr.unasat.entities.Reservation;
import sr.unasat.entities.Tafels;
import sr.unasat.entities.Werknemer;

import java.util.List;

public class App {

    public static void main(String[] args) {
        JPAconfig.getEntityManager();
        TafelsDao tafelsDao = new TafelsDao(JPAconfig.getEntityManager());
        ReservationDao reservationDao = new ReservationDao(JPAconfig.getEntityManager());
        KlantDao klantDao = new KlantDao(JPAconfig.getEntityManager());
        WerknemerDao werknemerDao = new WerknemerDao(JPAconfig.getEntityManager());
        LocationDao locationDao = new LocationDao(JPAconfig.getEntityManager());

        List<Werknemer>  WerknemerList = WerknemerDao.retrieveWerknemerList();
        WerknemerList.stream().forEach(System.out::println);
        for (Werknemer werknemer : WerknemerList) {
            System.out.println(WerknemerList);
        }



    }
}
