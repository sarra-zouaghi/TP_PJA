package Dev_TP2;

import java.io.IOException;

import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.Scanner;

class Class1 {
    public static void main(String[] args) {

       ArrayList <Employee> objects = new ArrayList<Employee>();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter number of objects");
        int num = keyboard.nextInt();

        for(int i = 0; i < num; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the name of employee");
            String name = sc.nextLine();
            System.out.println("Please enter the address of employee");
            String address =sc.nextLine();
            System.out.println("Please enter the SSN of employee");
            int SSN = sc.nextInt();
            System.out.println("Please enter number ");
            int number = sc.nextInt();

            Employee empl = new Employee();
           objects.add(empl);
        }

        System.out.println("Serialization started");
        try {
            FileOutputStream fes = new FileOutputStream("emp.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fes);

            oos.writeObject(objects);
            oos.close();
            fes.close();
            System.out.printf("donnees serialisees sauvegardees dans employee.dat");


        }catch(IOException i){
            i.printStackTrace();
        }






    }
}
