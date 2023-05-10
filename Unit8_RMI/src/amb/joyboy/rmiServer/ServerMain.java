package amb.joyboy.rmiServer;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import amb.joyboy.rmi.Messageimpl;

public class ServerMain {
	public void StartServer() throws RemoteException, AlreadyBoundException {
		Registry registry = LocateRegistry.createRegistry(1099);
		registry.bind("myMessage", new Messageimpl());
	}

	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		new ServerMain().StartServer();

	}

}
