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
public class BooksDao  {
      Session s = util.Connection.getSessionFactory().openSession();
      Transaction tr = s.beginTransaction();
      
      public void save(models.Books b){
        s.save(b);
        tr.commit();
        s.close();
      }
      public List<models.Books> display(){
          return s.createQuery("from Books").list();
      }
      public void update(models.Books b){
        s.update(b);
        tr.commit();
        s.close();
      }
      public void delete(int id){
         models.Books book = (models.Books) s.get(models.Books.class, id);
        s.delete(book);
        tr.commit();
        s.close();
      }
}
