package Dev_TP2;

import java.io.IOException;

import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

import java.util.Scanner;

class Serialization {
    public static void main(String[] args) throws Exception {
        ArrayList<Employee> objects = new ArrayList<Employee>();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter number of objects");
        int num = keyboard.nextInt();

        for(int i = 0; i < num; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the name of employee");
            String name = sc.nextLine();
            System.out.println("Please enter the adress of employee");
            String address =sc.nextLine();
            System.out.println("Please enter the SSN of employee");
            int SSN = sc.nextInt();
            System.out.println("Please enter number ");
            int number = sc.nextInt();

            Employee emp = new Employee( name, address,SSN,number);
            objects.add(emp);
        }

        System.out.println("Serialization started");
        try {
            FileOutputStream fes = new FileOutputStream("emp.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fes);

            oos.writeObject(emp);
            oos.close();
            fes.close();
            System.out.printf("donnees serialisees sauvegardees dans employee.ser");


        }catch(IOException i){
            i.printStackTrace();
        }






    }
}
