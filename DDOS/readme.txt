Name: Danilo Torres Fleites
login: danilo97
student#:214152326
Date: 8-Nov-2018


To be able to compile and run these programs follow the following steps:


first open 5 different console windows and compile all the classes in either console:
javac Node.java
javac Server.java
javac KKMultiServerThread.java
javac Coordinator.java

then run the server first in one of the consoles using java Server <ServerPort>
for example:
java Server 1111

then run the node in 3 different consoles using java Node <ServerIP> <NodePort> <ServerPort>
for example:
for node 1: java Node localhost 2222 1111
for node 2: java Node localhost 3333 1111
for node 3: java Node localhost 4444 1111

then run the coordinator in a seperate console using java Coordinator <Node1IP> <Node1Port> <Node2IP> <Node2Port> <Node3IP> <Node3Port> 
for example:
java Coordinator localhost 2222 localhost 3333 localhost 4444

You can now open and check the connections log in the server.log file created.
Done.

Not sure if this does not work for some cases, didn't test it on several computers.
If I would have had more time, I would've organized the code more and removed redundant repetitions.
I would have also created a better server.log file.


