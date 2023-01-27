package sr.unasat.application;

import sr.unasat.config.JPAconfiguration;
import sr.unasat.dao.*;
import sr.unasat.entities.Klanten;
import sr.unasat.entities.Reservation;
import sr.unasat.entities.Werknemer;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public abstract class App {

    public static void main(String[] args) {
        //scanner test
        Scanner Yesno = new Scanner(System.in);

        JPAconfiguration.getEntityManager();
        TafelsDao tafelsDao = new TafelsDao(JPAconfiguration.getEntityManager());
        ReservationDao reservationDao = new ReservationDao(JPAconfiguration.getEntityManager());
        KlantDao klantDao = new KlantDao(JPAconfiguration.getEntityManager());
        WerknemerDao werknemerDao = new WerknemerDao(JPAconfiguration.getEntityManager());
        LocationDao locationDao;
        locationDao = new LocationDao(JPAconfiguration.getEntityManager());

        System.out.println("Alle werknemers");
        List<Werknemer> werknemerList = WerknemerDao.retrieveWerknemerList(); // WORKS RR
        System.out.println("Alle klanten ");
        List<Klanten> klantenList = KlantDao.retrieveKlantenList(); // WORKS RR
        System.out.println("Reservation list");
        List<Reservation> reservationList = ReservationDao.getResList(Date.valueOf("2022-01-01"), Date.valueOf("2022-03-31"));


    }
    public abstract Map<String, Object> getProperties();
}




