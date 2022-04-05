package javaStudy.Netork;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ConnectionServer {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(2000); //2000번 포트
		
		while(true) {
			//accept() : 클라이언트의 소켓 연결을 기다리는 메소드
			//클라이언트가 접속되기 전까지 서버의 스레드는 중지
			//클라이언트가 접속되면 클라이언트와 데이터를 입력 또는 출력할 수 있는 스트림을 가진 소켓 객체 반환
			Socket socket = server.accept();
			System.out.println("Client와  연결된 Server의 Socket 객체 =" +socket);
			socket.close();
		}
	}
}
