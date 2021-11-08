package Dev_TP2;

import java.io.*;
import java.io.RandomAccessFile;
import java.io.IOException;
import  java.io.FileNotFoundException;
public class Class2 {
    public static void main(String[] args) {
        Employee e = null;
 System.out.println("Deserialisation \n");
        try {
            FileInputStream fileIn = new FileInputStream("emp.dar");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i) {
            i.printStackTrace();
        return;
        }catch (ClassNotFoundException c){
            System.out.println("classe employee non trouvee");
            c.printStackTrace();
            return;
        }
        System.out.println("Employee deserialise...");
        System.out.println("Nom: " + e.name);
        System.out.println("Adresse: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);

        //Random Access File
        try {
            RandomAccessFile rnd= new RandomAccessFile("empdirect.dat","rw");



        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}
