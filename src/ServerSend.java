import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerSend extends Thread{
	private PrintWriter bw=null;
	Scanner in=new Scanner(System.in);
	private Socket s=null;
	public ServerSend(Socket s) {
		this.s=s;
	}
	public void run() {
		
			try {
				
//				System.out.println("++++++++++++");
				bw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
				System.out.println("��������Ϣ��");
				while(true) {
				String str=in.nextLine();
				System.out.println("-----------"+str);
				bw.print(str);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("baocuo");
//			}
			}finally {
//				if(bw!=null) {
//					try {
//						bw.close();
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//	//					e.printStackTrace();
//					}
//				}
			}
		}

}
