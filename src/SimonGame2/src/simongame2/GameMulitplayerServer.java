package simongame2;

import java.net.*;
import java.io.*;

public class GameMulitplayerServer {
	public static void main(String[] args) throws Exception
	{
		ServerSocket s = new ServerSocket(9999);
		Socket ss = s.accept();
		System.out.println("connected");
		DataInputStream dout = new DataInputStream(ss.getInputStream());
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		while (true)
		{
			String message = dout.readUTF();
			System.out.println("Client: "+message);
			if (message.equalsIgnoreCase("Exit"))
			{
				break;
			}
		}
		ss.close();
	}

}
