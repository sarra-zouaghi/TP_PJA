package Dev2;

import java.io.*;
import java.net.*;


public class server {
    public static void main(String[]args)throws Exception {

        ServerSocket serverSocket= new ServerSocket(9090);
        File nomRep = new File("C:\\Users\\PC\\Desktop\\");
        File[] liste = nomRep.listFiles();
        while (true){
            Socket socket = serverSocket.accept();

            System.out.println("Server Listening on Port " + socket.getLocalPort());
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));



            if (nomRep.isDirectory()){
                for(File item : liste){
                    if(item.isFile())
                    {
                        System.out.println(" \n Nom du fichier"+ item.getName());
                    }

                }
            }else {
                System.out.println("nomRep is not a directory");}}









    }
}
