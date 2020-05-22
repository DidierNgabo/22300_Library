/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.rmi.*;
import models.Clients;

/**
 *
 * @author HP
 */
public interface IClientService extends Remote {
  public boolean insert(Clients client) throws RemoteException; 
  public boolean update(Clients client) throws RemoteException;
  public boolean delete(int id) throws RemoteException;
}
