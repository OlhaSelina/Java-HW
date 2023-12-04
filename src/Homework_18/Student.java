package Homework_18;

public class Student {

    public String name;
    public int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;

    }
    public void List(){
        System.out.println("Student " + name + " - " + age + " years." );
    }



}
