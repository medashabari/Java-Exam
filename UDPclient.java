import java.net.*;
import java.io.*;
class UDPclient{
	public static void main(String args[]) throws IOException{
		DatagramSocket ds = new DatagramSocket();
		InetAddress ip = InetAddress.getByName("localhost");
		byte[] sd= new byte[1024];
		String msg="HEllo server! this is udp client";
		sd=msg.getBytes();
		DatagramPacket pkt = new DatagramPacket(sd,sd.length,ip,5000);
		ds.send(pkt);
		ds.close();

	}
}