/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.rmi.*;

/**
 *
 * @author HP
 */
public interface IBookCategoryService extends Remote{
    public boolean insert(models.Bookcategory category) throws RemoteException;
    public boolean delete(int categoryId) throws RemoteException;
    public boolean update(models.Bookcategory category) throws RemoteException;
}
