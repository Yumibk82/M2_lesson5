package com.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {

        Student s1=new Student(111,"Hang");
        Student s2=new Student(222,"Bao");
        Student s3=new Student(333,"Tung");
        Student s4=new Student(444,"Tam");

        s1.display();
        s2.display();
        s3.display();
        s4.display();

        Student.change();
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
