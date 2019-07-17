import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ClientInThread implements Runnable {

	DataInputStream dis = null;
	Scanner sc = new Scanner(System.in);
	Socket socket = null;

	public ClientInThread(Socket socket, DataInputStream dis) {
		this.socket = socket;
		this.dis = dis;
	}

	/*
	 * �ͻ��˽�����Ϣ
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		while (true) {
			try {
				// ���ܶԷ����͹�������Ϣ
				dis = new DataInputStream(socket.getInputStream());
				String request = dis.readUTF();
				System.out.println("���Է������˵���ϢΪ:" + request);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
