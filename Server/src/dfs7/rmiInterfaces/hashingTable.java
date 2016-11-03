package dfs7.rmiInterfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface hashingTable extends Remote {
    void addNode(String nodeName, String nodeIP) throws RemoteException;
    String getNodes() throws RemoteException;
}
