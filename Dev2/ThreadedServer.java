
import java.io.*;
import java.net.*;

public class ThreadedServer {
    public static void main(String[] args) {
        
       
        System.out.println("waiting for client...");
        try {
            ServerSocket serverSocket = new ServerSocket(9090);
            System.out.println("Server listening on Port :" + socket.getLocalPort());
            while (true) {
                 
                Socket socket = serverSocket.accept();
                ThreadTask clientThread = new ThreadTask(socket);
                clientThread.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
