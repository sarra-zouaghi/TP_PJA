import java.net.*;
import java.io.*;
public class client {
    public static void main(String[]args)throws Exception {

        InetAddress serverAdd = InetAddress.getLocalHost();
        serverAdd.getHostAddress();
        
        Socket socket = new Socket(serverAdd, 5050);
      /*  DataInputStream dis = new DataInputStream(socket.getInputStream());
        OutputStream dos = new FileOutputStream(socket.getOutputStream());
        String name = "C:\\Users\\PC\\Desktop\\bda1";

        File nomRep  = new File(name);

        dos.writeUTF(name);
        System.out.println(dis.readUTF().toString());



       /* System.out.println(dis.readUTF());
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


        socket.close();

    }
}
