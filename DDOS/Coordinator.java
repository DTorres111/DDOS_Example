
//Instructs each of the 3 nodes to attack the server now.
//Compile using javac Coordinator.java and run last using java Coordinator <Node1Name> <Node1Port> <Node2Name> <Node2Port> <Node3Name> <Node3Port> 


import java.io.*;
import java.net.*;
import java.util.*;

class Coordinator{
 public static void main(String args[]) throws Exception {


//client code
  String hostName1 = args[0];
  int serverPort1 = Integer.parseInt(args[1]);			
  Socket clientSocket1 = new Socket(hostName1,serverPort1);

  DataOutputStream outToServer = new DataOutputStream(clientSocket1.getOutputStream());

	outToServer.writeBytes("attack");

  String hostName2 = args[2];
  int serverPort2 = Integer.parseInt(args[3]);			
  Socket clientSocket2 = new Socket(hostName2,serverPort2);

  outToServer = new DataOutputStream(clientSocket2.getOutputStream());

	outToServer.writeBytes("attack");

  String hostName3 = args[4];
  int serverPort3 = Integer.parseInt(args[5]);		
  Socket clientSocket3 = new Socket(hostName3,serverPort3);

  outToServer = new DataOutputStream(clientSocket3.getOutputStream());

	outToServer.writeBytes("attack");


  	clientSocket1.close();
	clientSocket2.close();
	clientSocket3.close();

 }
}
