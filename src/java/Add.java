/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.smart.models.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
 
/**
 *
 * @author mushabe
 */
public class Add {
    
    int i=0;
    public static void main(String []args){
        
     //new StoreData().i = 5; 
       
    //creating configuration object
    Configuration cfg = new AnnotationConfiguration();
    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
    
    //creating seession factory object
    SessionFactory factory=cfg.buildSessionFactory(); 
    
    //creating session object
    Session session=factory.openSession(); 
    
    //creating transaction object
    Transaction t=session.beginTransaction();
    Person e1=new Person ();
    
    e1.setId(3);
    e1.setFirstName("Nsumba");
    e1.setLastName("solomon");
    
    session.persist(e1);//persisting the object
    t.commit();//transaction is commited
    session.close();
        
    System.out.println("Perfection is mine");
    
   
        
    }
    
}
