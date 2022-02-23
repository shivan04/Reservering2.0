package sr.unasat.dao;

import sr.unasat.entities.Klanten;
import sr.unasat.entities.Location;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class KlantDao {

    private static EntityManager entityManager;


    public KlantDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public static Klanten insert(Klanten klanten) {
        entityManager.getTransaction().begin();
        entityManager.persist(klanten);
        entityManager.getTransaction().commit();
        return klanten;
    }

    public static Klanten findByklantNummer (int klantNummer) {
        entityManager.getTransaction().begin();
        String jpql = "select t from Klanten t  where t.klantenNummer = :klantenNummer";
        TypedQuery<Klanten> query = entityManager.createQuery(jpql, Klanten.class);
        Klanten klanten = query.setParameter("klantenNummer", klantNummer).getSingleResult();
        entityManager.getTransaction().commit();
        return klanten;
    }

    public int  delete ( int klantNummer) {
        entityManager.getTransaction().begin();
        Query query;
        query = entityManager.createQuery("delete from Klanten where klantenNummer = :klantNummer ");
        query.setParameter("klantNummer", klantNummer);
        int rowsDeleted = query.executeUpdate();
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;
    }
    public static List<Klanten> retrieveKlantenList() {
        entityManager.getTransaction().begin();
        String jpql = "select k from Klanten k ";
        TypedQuery<Klanten> query = entityManager.createQuery(jpql, Klanten.class);
        List<Klanten> klantenList = query.getResultList();
        entityManager.getTransaction().commit();
        return klantenList;
    }
    public static int updateKlanten(Klanten klanten) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("UPDATE Klanten  SET adress = :adress where klantenNummer= :klantenNummer");
        query.setParameter("klantenNummer", klanten.getKlantenNummer());
        query.setParameter("adress", klanten.getAdress());
        int rowsUpdated = query.executeUpdate();
        System.out.println("entities Updated: " + rowsUpdated);
        entityManager.getTransaction().commit();
        return rowsUpdated;
    }



}
