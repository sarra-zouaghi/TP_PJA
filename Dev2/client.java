package Dev2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class client {
    public static void main(String[]args)throws Exception {



        InetAddress serverAdd = InetAddress.getLocalHost();
        serverAdd.getHostAddress();

        Socket socket = new Socket(serverAdd, 9090);
        PrintWriter pw = new PrintWriter(socket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));


 /* System.out.println(br.readUTF());
        InputStream fin = new FileInputStream(nomRep);


       File[] liste = nomRep.listFiles();
       for (int i=0 ; i< liste.length; i++){
       if ((nomRep.isDirectory()) && liste[i].exists()){

           System.out.println("le fichier $i :"+ liste[i]);
       }else{
           System.out.println("nomRep is not a directory");
       }
       }



        /*if (nomRep.isDirectory()){
            for(File item : liste){
                if(item.isFile())
                {
                    System.out.format("Nom du fichier: %s%n", item.getName());
                }

            }
        }else {
            System.out.println("nomRep is not a directory");
        }*/



        br.close();
        pw.close();
        socket.close();

    }
}
