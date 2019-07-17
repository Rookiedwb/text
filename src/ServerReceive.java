import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceive extends Thread{
	private Socket s=null;
	private BufferedReader br=null;
	public ServerReceive(Socket s) {
		this.s=s;
	}
	
	public void run() {
		while(true) {
			try {
					br=new BufferedReader(new InputStreamReader(s.getInputStream()));
					String s=br.readLine();
					if(s!=null) {
						System.out.println("���������յ�����Ϣ�ǣ�"+s);
					}
			} catch (IOException e) {
				// TODO Auto-generated catch block
	//			e.printStackTrace();
			
			}
		}
	}
}
