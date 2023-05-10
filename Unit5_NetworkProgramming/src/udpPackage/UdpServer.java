package udpPackage;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpServer {

	public UdpServer() throws IOException {
		
		DatagramSocket soc = new DatagramSocket(2222);
		byte[] data = new byte[256];
		//Receiving request
		DatagramPacket packet = new DatagramPacket(data,data.length);
		soc.receive(packet);
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		//sending response
		String resmess = "Hi Sauwan Thapa I am your server";
		data=resmess.getBytes();//convert string to bytes
		packet = new DatagramPacket(data,data.length,address,port);
		soc.send(packet);//send response
		
		
	}
	public static void main(String[] args) throws IOException {
		new UdpServer();

	}

}
