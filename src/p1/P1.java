/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author vsa
 */
public class P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("p1PU");
        EntityManager em = emf.createEntityManager();
        
        Query q = em.createNativeQuery("select * from KNIHA", Kniha.class);
        List<Kniha> knihy = q.getResultList();
        
        for(Kniha k: knihy){
            System.out.println("" +k);
        }
        
        
        /*
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * from kniha");
        
        List<Kniha> knihy = new ArrayList<>();
        
        while(rs.next()){
            
            Kniha k = new Kniha();
            
            k.nazov = rs.getString(1);
            k.cena = rs.getDouble("CENA");
            knihy.add(k);
            System.out.println("" + k);
        }*/
    }
}
