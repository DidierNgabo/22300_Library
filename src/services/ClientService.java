/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import controllers.ClientDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import models.Clients;

/**
 *
 * @author HP
 */
public class ClientService extends UnicastRemoteObject implements IClientService {

    public ClientService() throws RemoteException {
        super();
    }
    ClientDao cl = new ClientDao();

    @Override
    public boolean insert(Clients client) throws RemoteException {
        try {
            cl.save(client);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Clients client) throws RemoteException {
        try {
            cl.update(client);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(int id) throws RemoteException {
        try {
            cl.delete(id);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
