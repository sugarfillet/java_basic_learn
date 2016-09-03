package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 聊天室客户端
 * 
 * @author tarena
 *
 */
public class Client {

	 /*
	  * java.net.Socket
	  * 基于TCP 运行在客户端
	  * Socket作用
	  * 1.连接服务器
	  * 2.通过socket获取一个输入流与输入流
	  * 与远程计算机进行数据交换以完成网络通信要求
	  * 
	  */
	private Socket socket;

	/*
	 * 构造方法
	 */
	public Client() throws UnknownHostException, IOException{
		/*
		 * 在实例化Socket的时候 需要传入两个参数
		 * ip port
		 * IP连接到计算机
		 * port连接到计算机上的目标应用程序
		 * 
		 * 实例化Socket的过程  就是建立连接的过程
		 * 否则会没有响应抛出异常
		 * 
		 */
		System.out.println("正在连接服务端...");
		socket  = new Socket("127.1.1.1",8088);
		System.out.println("已连接！");
	}
	/*
	 * 客户端开始工作的方法
	 * 
	 */
	public void start() {
		//获取向socket中的写入字节流
		
		OutputStream os;
		try {
			ServerHandler handler = new ServerHandler();
			Thread t = new Thread(handler);
			t.start();
			
			os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw,true);
			Scanner scan = new Scanner(System.in);
			while(true){
				pw.println(scan.nextLine());	
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(socket != null){
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}


	}
	public static void main(String[] args) {
		try {
			
			Client client = new Client();
			client.start();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("客户端启动失败");
		}
	}
	private class ServerHandler implements Runnable{

		
		
		public void run() {
			try{
				InputStream in  = socket.getInputStream();
				InputStreamReader isr  = new InputStreamReader(in, "UTF-8");
				BufferedReader br  = new BufferedReader(isr);
				while(true){
					System.out.println(br.readLine());
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
			
		}
		
	}
}
