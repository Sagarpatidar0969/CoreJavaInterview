package com.networking;

import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloTCPServer {
	public static void main(String[] args)  throws Exception{
		
		ServerSocket server = new ServerSocket(1235);
		System.out.println("server starting. Waiting for a client");
		
		Socket client = server.accept();
		System.out.println("client connected");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		DataOutputStream out = new DataOutputStream(client.getOutputStream());
		
		out.writeBytes("Hello client\n");
		
		String greeting = in.readLine();
		System.out.println("Received from client:" + greeting);
		
		client.close();
		server.close();
		System.out.println("server closed");
		
	}

}
