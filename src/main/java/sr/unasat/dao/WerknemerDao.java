package sr.unasat.dao;

import sr.unasat.entities.Werknemer;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class WerknemerDao {

    private static EntityManager entityManager;


    public WerknemerDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public static Werknemer insert(Werknemer werknemer) {
        entityManager.getTransaction().begin();
        entityManager.persist(werknemer);
        entityManager.getTransaction().commit();
        return werknemer ;
    }
    public Werknemer findBywerkenmerId(int werkenmerId) {
        entityManager.getTransaction().begin();
        String jpql = "select t from Werknemer t  where t.werkenmerId = :werkenmerId";
        TypedQuery<Werknemer> query = entityManager.createQuery(jpql, Werknemer.class);
        Werknemer werknemer = query.setParameter("werkenmerId", werkenmerId).getSingleResult();
        entityManager.getTransaction().commit();
        return werknemer;
    }
    public static  List<Werknemer> retrieveWerknemerList() {
        entityManager.getTransaction().begin();
        String jpql = "select l from Werknemer l ";
        TypedQuery<Werknemer> query = entityManager.createQuery(jpql, Werknemer.class);
        List<Werknemer> werknemerList = query.getResultList();
        entityManager.getTransaction().commit();
        return werknemerList;
    }
    public static int  delete(int werkenmer_id) {
        entityManager.getTransaction().begin();
        Query query;
        query = entityManager.createQuery("delete from Werknemer where werkenmerId = :werkenmerId ");
        query.setParameter("werkenmerId", werkenmer_id);
        int rowsDeleted = query.executeUpdate();
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;
    }
    public int updateWerknemer(Werknemer werknemer) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("UPDATE Werknemer c SET c.adress = :adress where c.werkenmerId = :werkenmer_id");
        query.setParameter("werkenmer_id", werknemer.getWerkenmerId());
       query.setParameter("adress", werknemer.getAdress());
        int rowsUpdated = query.executeUpdate();
        System.out.println("entities Updated: " + rowsUpdated);
        entityManager.getTransaction().commit();
        return rowsUpdated;
    }
}
