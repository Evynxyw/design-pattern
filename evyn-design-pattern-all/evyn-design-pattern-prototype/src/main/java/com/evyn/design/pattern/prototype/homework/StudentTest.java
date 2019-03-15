package com.evyn.design.pattern.prototype.homework;

import java.io.IOException;

/**
 * @ClassName StudentTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/15 21:36
 * @Version 1.0
 */
public class StudentTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Book book = new Book("Engilis");
        Student student1 = new Student("evyn", 20, book);
        Student student2 = student1.clone();
        System.out.println(student1 == student2);
        System.out.println(student1.getBook() == student2.getBook());


        Student student3 = student1.deepClone();
        System.out.println(student1 == student3);
        System.out.println(student1.getBook() == student3.getBook());

    }
}
