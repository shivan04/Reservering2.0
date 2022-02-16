package sr.unasat.dao;

import sr.unasat.entities.Reservation;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class ReservationDao {
    private static EntityManager entityManager;


    public ReservationDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //insert
    public static Reservation insert(Reservation reservation) {
        entityManager.getTransaction().begin();
        entityManager.persist(reservation);
        entityManager.getTransaction().commit();
        return reservation;
    }
    public static Reservation findByReservationNumber(int ReservationNumber) {
        entityManager.getTransaction().begin();
        String jpql = "select t from Reservation t  where t.reservationNumber = :reservationNumber";
        TypedQuery<Reservation> query = entityManager.createQuery(jpql, Reservation.class);
        Reservation reservation = query.setParameter("reservationNumber", ReservationNumber).getSingleResult();
        entityManager.getTransaction().commit();
        return reservation;
    }

    //delete
    public static int  delete(int reservation_id) {
        entityManager.getTransaction().begin();
        Query query;
        query = entityManager.createQuery("delete from Reservation  where reservationId = :reservationId ");
        query.setParameter("reservationId", reservation_id);
        int rowsDeleted = query.executeUpdate();
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;

    }
    public static List<Reservation> retrieveReservationList() {
        entityManager.getTransaction().begin();
        String jpql = "select r from Reservation  r ";
        TypedQuery<Reservation> query = entityManager.createQuery(jpql, Reservation.class);
        List<Reservation> ReservationList = query.getResultList();
        entityManager.getTransaction().commit();
        return ReservationList;
    }

    public int updateReservation(Reservation reservation) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("UPDATE Reservation r SET r.beginTijd = :beginTijd where r.reservationId = :reservation_id");
        query.setParameter("reservation_id", reservation.getReservationId());
      query.setParameter("beginTijd", reservation.getBeginTijd());
        int rowsUpdated = query.executeUpdate();
        System.out.println("entities Updated: " + rowsUpdated);
        entityManager.getTransaction().commit();
        return rowsUpdated;
    }



}
