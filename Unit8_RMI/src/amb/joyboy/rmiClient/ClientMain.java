package amb.joyboy.rmiClient;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import amb.joyboy.rmi.Message;

public class ClientMain {
public void doTest() throws RemoteException, NotBoundException {
	//fire to localhost port 1099
	Registry myRegistry = LocateRegistry.getRegistry("127.0.0.1",1099);
	//search for myMessage service in the registry
	//gets remote objct i.e. instance of MessageImpl
	Message impl = (Message) myRegistry.lookup("myMessage");
	//call server's method
	String s = impl.sayHello(" Sauwan Thapa");
	//int d = impl.sayFactorial(5);
	System.out.println("The message is :"+ s);
	//System.out.println("The factorial is :"+d);
}
	public static void main(String[] args) throws RemoteException, NotBoundException {
		new ClientMain().doTest();

	}

}
