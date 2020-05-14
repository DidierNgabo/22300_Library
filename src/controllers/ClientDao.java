/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HP
 */
public class ClientDao {
     Session s= util.Connection.getSessionFactory().openSession();
     Transaction tr = s.beginTransaction();
     
     public void save(models.Clients cl){
       s.save(cl);
        tr.commit();
        JOptionPane.showMessageDialog(null, "client successfully added");
        s.close();
     }
     public List<models.Clients> display(){
          return s.createQuery("from Clients").list();
      }
     public void update(models.Clients cl){
       s.update(cl);
        tr.commit();
        JOptionPane.showMessageDialog(null, "client updated successfully");
        s.close();
     }
     public void delete(int id){
       models.Clients client= (models.Clients) s.get(models.Clients.class, id);
       s.delete(client);
        int input = JOptionPane.showConfirmDialog(null,
                "Do you want to delete this client", "Select an Option...", JOptionPane.YES_NO_OPTION);
        // 0=yes, 1=no, 2=cancel
        System.out.println(input);
        if (input == 0) {
            tr.commit();
            JOptionPane.showMessageDialog(null, "client  deleted successfully");
        } else {
            JOptionPane.showMessageDialog(null, "operation cancelled");
        }
        s.close();
     }
     
}
