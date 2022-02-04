package sr.unasat.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAconfig {
    private  final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
    private static final EntityManager entityManager = factory.createEntityManager();


    public  EntityManagerFactory getEntityManagerFactory() {
        return factory;
    }
    public static EntityManager getEntityManager() {
        return entityManager;
    }



    public static void shutdown() {
        if (entityManager != null) {
            entityManager.close();
        }
        if (factory != null) {
            factory.close();
        }
    }

}
