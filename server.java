import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[]args)throws Exception {

        ServerSocket serverSocket = new ServerSocket(5050);


        while (true) {
            Socket socket = serverSocket.accept();

            System.out.println("Server Listening on Port " + socket.getLocalPort());

           // DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

           // DataInputStream dis = new DataInputStream(socket.getInputStream());



           /* File nomRep = new File("C:\\Users\\PC\\Desktop\\");
            File[] liste = nomRep.listFiles();
            for (int i = 0; i< liste.length; i++){
                if ((nomRep.isDirectory())&& (liste[i].exists())){
                    System.out.println(liste[i].getName());
                }else {
                    System.out.println("hkfjgfjh");
                }
            }*/





                socket.close();
            }

    }}
