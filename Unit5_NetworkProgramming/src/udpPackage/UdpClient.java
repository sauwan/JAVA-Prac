package udpPackage;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

//DatagramSocket,DatagramPacket
public class UdpClient {

	public UdpClient() throws IOException {

		DatagramSocket soc = new DatagramSocket();
		// data that needs to be sent
		byte[] data = new byte[256];
		InetAddress address = InetAddress.getByName("localhost");
		DatagramPacket packet = new DatagramPacket(data, data.length, address, 2222);
		soc.send(packet);
		// get response
		packet = new DatagramPacket(data, data.length);
		soc.receive(packet);
		String response = new String(packet.getData());// this converts byte to string
		System.out.println("Response is :" + response + "of size" + response.length());

	}

	public static void main(String[] args) throws IOException {
		new UdpClient();
	}

}
