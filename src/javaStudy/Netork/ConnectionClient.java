package javaStudy.Netork;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ConnectionClient {
	public static void main(String[] args) throws Exception, IOException {
		Socket socket = new Socket("192.168.0.3", 2000);
		System.out.println("서버와 연결된 클라이언트 Socket 객체 = " +socket );
		socket.close();
	}
}
