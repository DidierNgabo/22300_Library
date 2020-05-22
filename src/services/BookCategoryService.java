/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import controllers.BookCategoryDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import models.Bookcategory;

/**
 *
 * @author HP
 */
public class BookCategoryService extends UnicastRemoteObject implements IBookCategoryService {

    public BookCategoryService() throws RemoteException {
        super();
    }

    @Override
    public boolean insert(Bookcategory category) throws RemoteException {
        try {
            BookCategoryDao bkcatDao = new BookCategoryDao();
            bkcatDao.save(category);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean delete(int categoryId) throws RemoteException {
        try{
            BookCategoryDao bkcatDao = new BookCategoryDao();
            bkcatDao.delete(categoryId);
            return true;
        } catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Bookcategory category) throws RemoteException {
       try{
           BookCategoryDao bkcatDao = new BookCategoryDao();
            bkcatDao.update(category);
            return true;
       } catch(Exception ex){
         ex.printStackTrace();
         return false;
       }
    }

}
