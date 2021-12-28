package Dev2;

import java.io.*;
import java.net.*;
public class ThreadTask extends Thread{
 Socket socket = null;
  public ThreadTask(Socket socket){
        this.socket=socket;
    }
  public void run(){
    File nomRep = new File("C:\\Users\\PC\\Desktop\\");
    try{
   
     PrintWriter pw = new PrintWriter(socket.getOutputStream());
     BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
     String rec = in.readLine();
     if (nomRep.isDirectory()){
                for(File item : liste){
                    if(item.isFile())
                    {
                        System.out.println(" \n Nom du fichier"+ item.getName());
                    }

                }
       }else {
                System.out.println("nomRep is not a directory");}}
    
    }catch(Exception e){
       e.printStackTrace();
    }
  }

}
