package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 聊天室服务端
 * 
 * @author tarena
 *
 */
public class Server {
/**
 * 
 * java.net.ServerSocket;
 * 运行在服务端的socket，主要作用:
 * 1.向os申请端口号
 * 2.监听服务端口
 */
	private ServerSocket server;
	private List<PrintWriter> allOut;
	private ExecutorService threadPool;

public Server() throws IOException  {
	server = new ServerSocket(8088);
	allOut = new ArrayList<PrintWriter>();
	threadPool = Executors.newFixedThreadPool(40);
}

private synchronized void addOut(PrintWriter out){
    allOut.add(out);
}
private synchronized void removeOut(PrintWriter out){
    allOut.remove(out);
}
private synchronized void sendMessage(String message){
    for(PrintWriter o : allOut){
        o.println(message);
    }
}
	public void start() throws IOException {
		/**
		 * ServerSocket提供了方法
		 * Socket accept（）
		 * 该方法是一个阻塞方法
		 * 作用是监听申请的端口
		 * 直到客户端发送连接 
		 * 
		 * 放回：socket实例  与客户端通信
		 * 
		 */
		while(true){
			System.out.println("等待客户端连接...");
			Socket socket = server.accept();
			System.out.println("一个客户端连接了");
			ClientHandler handler = new ClientHandler(socket);
			threadPool.execute(handler);
		}
	}
	public static void main(String[] args) throws IOException {
		Server server = new Server();
		server.start();
		
	}
	
	
	//内部类
	private class ClientHandler implements Runnable{

		private Socket socket;
		
		
		
		public ClientHandler(Socket socket) {
			super();
			this.socket = socket;
		}



		@Override
		public void run() {
			PrintWriter pw = null;
			OutputStream out;
			try {
				out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out);
				pw = new PrintWriter(osw,true);
				addOut(pw);
				
				
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(isr);
				/*while(true){
				
						System.out.println("client :"+br.readLine());
				
				}	*/
				
				String message = null;
				while((message = br.readLine()) != null){
					sendMessage(message);
				};
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally{
				removeOut(pw);
				if(socket!=null){
					try {
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

			
			
		
			
			
			
		}
		
	}
	
	
}
