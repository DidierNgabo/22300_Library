/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.rmi.*;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IBookService  extends Remote{
    public boolean insert(models.Books book) throws RemoteException;
    public boolean delete(int id) throws RemoteException;
    public boolean update(models.Books book) throws RemoteException;
}
