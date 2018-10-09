/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.db;

import Entities.Authors;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Keith
 */
public class AuthorsDB {
    public static List<Authors> getAllAuthors()
    {
        EntityManager em = DBUtil.getemf().createEntityManager();
        
        String q = "SELECT a from Authors a";
        
        TypedQuery<Authors> tq = em.createQuery(q, Authors.class);
        
        List<Authors> list;
        
        try
            {
                list =tq.getResultList();
                
                if (list == null || list.isEmpty())
                    list = null;
            }
            //Authors a = em.find(Authors.class, id);
            //return a;
        // end try
        finally
        {
            em.close();
        }
return list;//end finally
    }//end getAuthorByID()
    
}






//public static Authors getAuthorsByID(Integer id)
//    {
//        EntityManager em = DBUtil.getemf().createEntityManager();
//        try
//        {
//            Authors a = em.find(Authors.class, id);
//            return a;
//        }// end try
//        finally
//        {
//            em.close();
//        }//end finally
//    }//end getAuthorByID()