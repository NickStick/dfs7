package dfs7.dist;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import dfs7.rmiInterfaces.hashingTable;

public class cHashingTable extends UnicastRemoteObject implements hashingTable
{
    private ArrayList<cTableItem> table;

    protected cHashingTable() throws RemoteException {
        super();
        table = new ArrayList<>();
    }

    public void addNode(String nodeName, String nodeIP) {
        table.add(new cTableItem(hashMyString(nodeName), nodeIP));
        System.out.println("***** HASHING TABLE *****");
        for(int i = 0; i < table.size(); i++) {
            System.out.println(table.get(i).getID() + " - " + table.get(i).getIP());
        }
    }

    public String getNodes() {
        return "test";
    }

    public int hashMyString(String strToHash) {
        return Math.abs(strToHash.hashCode()) % 32769;
    }
}