package src.db;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author Keith
 */
public class DBUtil {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("JPQL_PU");
    
    public static EntityManagerFactory getemf()
    {
        return emf;
    }
}
