package tcpPackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	
	public TcpClient() throws UnknownHostException, IOException {
		Socket soc = new Socket("localhost",5555);
		DataInputStream in = new DataInputStream(soc.getInputStream());
		DataOutputStream out = new DataOutputStream(soc.getOutputStream());
	    String request = "hello server,I am Sauwan Thapa and my Roll no:20729/075";
	    out.writeUTF(request);//request is on the socket
	    String response = in.readUTF();
	    System.out.println("Response is : "+ response);
	    soc.close();
	    in.close();
	    out.close();
	//in client case (in) is response and (out) is request pathauney
	}
	

	public static void main(String[] args) throws UnknownHostException, IOException {
		new TcpClient();
	}

}
