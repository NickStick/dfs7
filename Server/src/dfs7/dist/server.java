package dfs7.dist;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class server {
    public server() {
        // TODO Auto-generated constructor stub
    }
    public static void main(String args[]) {
        System.out.println("Server running...");
        try
        {
            System.out.println("Creating hasing table...");
            cHashingTable nodeTable = new cHashingTable();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("nodeTable", nodeTable);
            System.out.println("Everyting OKE...");
        }
        catch (Exception e)
        {
            System.out.println("nodeTable err: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
