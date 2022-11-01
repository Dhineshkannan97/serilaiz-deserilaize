package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Impserial {

    String loc = "C:\\Users\\Dhinesh Kannan\\Downloads\\s.txt";

    public void serilazation() throws Exception {
        Testserial.Testser ser = new Testserial.Testser(25, 17, "dhinesh", "12345");
        FileOutputStream file = new FileOutputStream(loc);
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(ser);
        out.flush();
        out.close();
        System.out.println("success");
    }

    public void deSerilazation() throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(loc));
        Testserial.Testser ser = (Testserial.Testser) in.readObject();
        System.out.println(ser.age + ser.id + ser.name + ser.salary);
        in.close();
    }

    public static void main(String[] args) throws Exception {
        Impserial obj = new Impserial();
        obj.serilazation();
        obj.deSerilazation();

    }
}

