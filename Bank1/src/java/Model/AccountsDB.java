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
 * @author Keith
 */
public class AccountsDB {
    public static List<Accounts> getAllAccounts()
    {
        EntityManager em = DBUtil.getemf().createEntityManager();
        
        String q = "SELECT a from Accounts a";
        
        TypedQuery<Accounts> tq = em.createQuery(q, Accounts.class);
        
        List<Accounts> list;
        
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
    
    
    
    
    public static Accounts getAccountsByID(Integer id)
    {
        EntityManager em = DBUtil.getemf().createEntityManager();
        try
        {
            Accounts a = em.find(Accounts.class, id);
            return a;
        }// end try
        finally
        {
            em.close();
        }//end finally
    }//end getAuthorByID()
    
    
    
    
    
}
