import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;


public class ReceiveClass extends Thread {
	private Socket s=null;
	private BufferedReader br=null;
//	private BufferedWriter bw=null;
	public ReceiveClass(Socket s) {
		this.s=s;
		
	}
	
	public void run() {
		
		try {
				br=new BufferedReader(new InputStreamReader(s.getInputStream()));
//				System.out.println("------111111111-------");
				while(true) {
				String s=br.readLine();
				if(s!=null) {
					System.out.println("�ͻ��˽��յ�����Ϣ�ǣ�"+s);
				}
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
//		}finally {
//			if(br!=null) {
//				try {
//					br.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
		
		
	
	}
//	public void run() {
//		try {
////			bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
////			System.out.println("��������Ϣ��");
////			Scanner in=new Scanner(System.in);
////			String str=in.nextLine();
////			bw.write(str);
////			bw.flush();
//			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
//			String s=br.readLine();
//			System.out.println("���յ�����Ϣ�ǣ�"+s);
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//		
//		}finally {
////			if(s!=null) {
////				try {
////					s.close();
////				} catch (IOException e) {
////					// TODO Auto-generated catch block
////					e.printStackTrace();
////				}
////			}
//			if(br!=null) {
//				try {
//					br.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//		
//	}
}
