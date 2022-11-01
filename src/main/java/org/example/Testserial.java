package org.example;

import java.io.*;

public class Testserial implements Serializable {
    private static final long SerialVersionUID = 123456788L;
    public int age;
    transient int id;
    String name;

    public Testserial(int age, int id, String name) {

        this.age = age;
        this.id = id;
        this.name = name;
    }

    public static class Testser extends Testserial {
        String salary;

        public Testser(int age, int id, String name, String salary) {
            super(age, id, name);
            this.salary = salary;
        }
    }
}





