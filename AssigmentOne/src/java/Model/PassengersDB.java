/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author k00207850
 */
public class PassengersDB {
    public static List<Passengers> getAllPassengers()
    {
        EntityManager em = DBUtil.getemf().createEntityManager();
        
        String q = "SELECT p from Passengers p";
        
        TypedQuery<Passengers> tq = em.createQuery(q, Passengers.class);
        
        List<Passengers> list;
        
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
    }
    
    
     public static Passengers getPassengersDetails(Integer id)
    {
        EntityManager em = DBUtil.getemf().createEntityManager();
        try
        {
            Passengers a = em.find(Passengers.class, id);
            return a;
        }// end try
        finally
        {
            em.close();
        }//end finally
    }//end getAuthorByID()

    public static Passengers getPassengersDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
