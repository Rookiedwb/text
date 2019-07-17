import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ClientOutThread implements Runnable {

	DataOutputStream dos = null;
	Scanner sc = new Scanner(System.in);
	Socket socket = null;

	public ClientOutThread(Socket socket, DataOutputStream dos) {
		this.socket = socket;
		this.dos = dos;
	}

	/*
	 * 客户端发送消息
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		while (true) {
			try {
				String s = sc.nextLine();
				dos = new DataOutputStream(socket.getOutputStream());
				dos.writeUTF(s);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
