//Implementing a java Chatting Application using java tcp and UDP sockets
import java.net.*;
import java.io.*;
public class TCPclient{
	public static void main(String args[]) throws IOException{
	  Socket s = new Socket("localhost",4999);
	  PrintWriter pr = new PrintWriter(s.getOutputStream());
	  pr.println("HEllo form client");
	  pr.flush();
	  InputStreamReader in = new InputStreamReader(s.getInputStream());
	  BufferedReader bf = new BufferedReader(in);
	  String str = bf.readLine();
	  System.out.println("Server : "+str);
	}
}