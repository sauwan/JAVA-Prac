package amb.joyboy.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Messageimpl extends UnicastRemoteObject implements Message {

	public Messageimpl() throws RemoteException {
		super();
		
	}

	@Override
	public String sayHello(String message) throws RemoteException {
		
		return "Hello" + message;
	}

//	@Override
//	public int sayFactorial(int n) throws RemoteException {
//		if(n==0 || n==1)
//		{
//			return 1;
//		}
//		else
//		{
//			return n * sayFactorial(n-1);
//		}
//	}
//
    }
