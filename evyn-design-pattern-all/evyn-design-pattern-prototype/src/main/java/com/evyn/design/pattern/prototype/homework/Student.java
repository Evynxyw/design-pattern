package com.evyn.design.pattern.prototype.homework;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

/**
 * @ClassName Student
 * @Description:
 * @Author xyw
 * @Date 2019/3/15 21:26
 * @Version 1.0
 */
public class Student implements Cloneable, Serializable {
    private String name;
    private transient int age;
    private Book book;

    public Student() {
    }


    public Student(String name, int age, Book book) {
        this.name = name;
        this.age = age;
        this.book = book;
    }

    public Student clone(){
        Student stu = null;

        try {
            stu = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return stu;
    }

    public Student deepClone() throws IOException, ClassNotFoundException {
        Student stu = null;
        ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(byteOutputStream);
        oos.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(byteOutputStream.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        stu = (Student) ois.readObject();
        return stu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
