import java.util.Scanner;


public class ClientMessageThread implements Runnable {
	
	String[] responses = null;
	Scanner sc = new Scanner(System.in);

	@Override
	public void run() {
		while(true){
			String response = sc.nextLine();
			ClientSide.infolist.add(response);
		}
	}

}
