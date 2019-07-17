import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class SendClass extends Thread {
	private BufferedWriter bw=null;
	private BufferedReader br=null;
	private Socket s=null;
	public SendClass(Socket s) {
		this.s=s;
	}
	
	public void run() {
		while(true) {
			try {
					bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
//					System.out.println("------2222222222222-------");
	//				bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		//			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		//			String s=br.readLine();
		//			System.out.println("���յ�����Ϣ�ǣ�"+s);
					System.out.println("��������Ϣ��");
					Scanner in=new Scanner(System.in);
					String str=in.nextLine();
					bw.write(str);
					bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
	//			e.printStackTrace();
			
			}finally {
				if(bw!=null) {
					try {
						bw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
//			if(s!=null) {
//				try {
//					s.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			if(br!=null) {
//				try {
//					br.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
		}
		}
	}
}
