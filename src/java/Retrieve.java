/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import com.smart.models.Person;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
 
/**
 *
 * @author mushabe
 */
public class Retrieve {
    
  public static void main(String []args){
       //creating configuration object
    Configuration cfg = new AnnotationConfiguration();
    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
    
    //creating seession factory object
    SessionFactory factory=cfg.buildSessionFactory(); 
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         List employees = session.createQuery("FROM Person").list(); 
         for (Iterator iterator = 
                           employees.iterator(); iterator.hasNext();){
            Person e = (Person) iterator.next(); 
            System.out.print("First Name: " + e.getFirstName()); 
            System.out.print("  Last Name: " + e.getLastName()); 
            System.out.println("  ID: " + e.getId()); 
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
    
}



