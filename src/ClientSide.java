import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class ClientSide {
	
	public static List<String> infolist = new ArrayList<String>();
	
	public static void main(String[] args) {
		// ����socket,������������˵�����
		Socket socket = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		try {
			// ������������������:
			// ��һ��:Ҫ���ӵ�Ӧ�����ڵļ������IP��ַ
			// �ڶ���:Ҫ���ӵ�Ӧ�õĶ˿ں�
			System.out.println("-----------This is Client------------");
			socket = new Socket("10.10.25.6",8888);
				//���ܷ������˵Ļظ�
				ClientInThread cit = new ClientInThread(socket, dis);
				Thread tin = new Thread(cit);
				tin.start();
				
				// ��������˷�����Ϣ
				ClientOutThread cot = new ClientOutThread(socket, dos);
				Thread tout = new Thread(cot);
				tout.start();
				
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}/*finally{
			try {
				dis.close();
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
	}
}
