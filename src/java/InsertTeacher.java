/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smart.models.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author mushabe
 */
public class InsertTeacher extends HttpServlet {
    public void init(ServletConfig config) throws ServletException{
		super.init(config);
	}

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
            Configuration cfg = new AnnotationConfiguration();
    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
    
    //creating seession factory object
    SessionFactory factory=cfg.buildSessionFactory(); 
    
    //creating session object
    Session session=factory.openSession(); 
    
    //creating transaction object
    Transaction t=session.beginTransaction();
    Teacher e1=new Teacher ();
    
    String a = request.getParameter("fname");
    String b = request.getParameter("surname");
    String c = request.getParameter("otherName");
    String d = request.getParameter("username");
    String e = request.getParameter("password");
    String f = request.getParameter("mob");
    String g = request.getParameter("yob");
    String h = request.getParameter("gender");
    String i = request.getParameter("telNo");
    String j = request.getParameter("location");
    String k = request.getParameter("email");
    
    e1.setFname(a);
    e1.setSurname(b);
    e1.setOtherName(c);
    e1.setUsername(d);
    e1.setPassword(e);
    e1.setMob(f);
    e1.setYob(g);
    e1.setGender(h);
    e1.setTelNo(i);
    e1.setLocation(j);
    e1.setEmail(k);
    
    
    session.persist(e1);//persisting the object
    t.commit();//transaction is commited
    session.close();
        
    System.out.println("Perfection is mine");
    
            
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        doPost(request, response);
//    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
