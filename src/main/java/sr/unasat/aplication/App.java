package sr.unasat.aplication;

import org.w3c.dom.ls.LSOutput;
import sr.unasat.config.JPAconfig;
import sr.unasat.dao.*;

import sr.unasat.entities.Klanten;
import sr.unasat.entities.Reservation;
import sr.unasat.entities.Tafels;
import sr.unasat.entities.Werknemer;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //scanner test
        Scanner Yesno = new Scanner(System.in);

        JPAconfig.getEntityManager();
        TafelsDao tafelsDao = new TafelsDao(JPAconfig.getEntityManager());
        ReservationDao reservationDao = new ReservationDao(JPAconfig.getEntityManager());
        KlantDao klantDao = new KlantDao(JPAconfig.getEntityManager());
        WerknemerDao werknemerDao = new WerknemerDao(JPAconfig.getEntityManager());
        LocationDao locationDao = new LocationDao(JPAconfig.getEntityManager());

        System.out.println("Alle werknemers" );
        List<Werknemer> werknemerList = WerknemerDao.retrieveWerknemerList(); // WORKS RR
        System.out.println("Alle klanten ");
        List<Klanten> klantenList = KlantDao.retrieveKlantenList(); // WORKS RR
        System.out.println("Reservation list");
        List<Reservation> reservationList = ReservationDao.getResList(Date.valueOf("2022-01-01"), Date.valueOf("2022-12-31"));



    }
}




