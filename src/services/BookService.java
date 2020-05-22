/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import models.Books;

/**
 *
 * @author HP
 */
public class BookService  extends UnicastRemoteObject implements IBookService{
    
    
    public BookService() throws RemoteException{
     super();
    }

    @Override
    public boolean insert(models.Books book) throws RemoteException {
       try{
           controllers.BooksDao bookdao = new controllers.BooksDao();
           bookdao.save(book);
           return true;
       } catch(Exception ex){
          return false;
       }
    }

    @Override
    public boolean delete(int id) throws RemoteException {
        try{
            controllers.BooksDao bookdao = new controllers.BooksDao();
           bookdao.delete(id);
           return true;
       } catch(Exception ex){
         return false;
       }
    }

    @Override
    public boolean update(Books book) throws RemoteException {
        try{
            controllers.BooksDao bookdao = new controllers.BooksDao();
           bookdao.update(book);
           return true;
       } catch(Exception ex){
         return false;
       }
    }
    
}
