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
public class BookCategoryDao {

    Session s = util.Connection.getSessionFactory().openSession();
    Transaction tr = s.beginTransaction();

    public void save(models.Bookcategory bc) {
        s.save(bc);
        tr.commit();
        s.close();
    }

    public List<models.Bookcategory> display() {
        return s.createQuery("from Bookcategory").list();
    }

    public void update(models.Bookcategory b) {
        s.update(b);
        tr.commit();
        s.close();
    }

    public void delete(int id) {
        models.Bookcategory book = (models.Bookcategory) s.get(models.Bookcategory.class, id);
        s.delete(book);
        tr.commit();

        s.close();
    }
}
