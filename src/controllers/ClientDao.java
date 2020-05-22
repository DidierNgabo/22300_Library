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

    public void save(models.Clients cl) {
        Session s = util.Connection.getSessionFactory().openSession();
        Transaction tr = s.beginTransaction();
        s.save(cl);
        tr.commit();
        s.close();
    }

    public List<models.Clients> display() {
        Session s = util.Connection.getSessionFactory().openSession();
        Transaction tr = s.beginTransaction();
        return s.createQuery("from Clients").list();
    }

    public void update(models.Clients cl) {
        Session s = util.Connection.getSessionFactory().openSession();
        Transaction tr = s.beginTransaction();
        s.update(cl);
        tr.commit();
        s.close();
    }

    public void delete(int id) {
        Session s = util.Connection.getSessionFactory().openSession();
        Transaction tr = s.beginTransaction();
        models.Clients client = (models.Clients) s.get(models.Clients.class, id);
        s.delete(client);

        tr.commit();

        s.close();
    }

}
