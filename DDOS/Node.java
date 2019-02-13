//Compile this file using javac Node.java and run it second using java Node.java <ServerIP> <NodePort> <ServerPort>
//Make sure to run this in 3 different consoles, using a different NodePort for each.

import java.io.*;
import java.net.*;
import java.util.*;

class Node{
 public static void main(String args[]) throws Exception {

Boolean serverMode=true;

//server code
 int portNumber = Integer.parseInt(args[1]);

 ServerSocket welcomeSocket = new ServerSocket(portNumber);
    while (true) {  		

   Socket connectionSocket = welcomeSocket.accept();

   BufferedReader inFromClient =
    new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

	if(inFromClient.readLine().equals("attack")){
	serverMode=false;
		break;}
  }

//client code
if(serverMode==false){
  String hostName = args[0];
  int serverPort = Integer.parseInt(args[2]);			
  Socket clientSocket = new Socket(hostName,serverPort);

  DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
  BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

//sends random strings to server.
for(int i=0;i<30;i++){
outToServer.writeBytes("Random String " + (i+1) + '\n');
System.out.println(inFromServer.readLine());
Thread.sleep(900);
}

  clientSocket.close();
}

 }
}
