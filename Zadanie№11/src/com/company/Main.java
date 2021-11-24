package com.company;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Askar";
        student.age = 19;
        student.university = "Manas";
        student.profession="Accountant";
        System.out.println("Student 1:\n name: "+student.name+",\n age: "+student.age+",\n university: "
                +student.university+",\n profession: "+student.profession);
        System.out.println();

        Student student1 = new Student();
        student1.name="Nurbek";
        student1.age=21;
        student1.university="Politeh";
        student1.profession="Teacher";
        System.out.println("Student 2:\n name: "+student1.name+",\n age: "+student1.age+",\n university: "
                +student1.university+",\n profession: "+student1.profession);
        System.out.println();

        Student student2=new Student();
        student2.name="Ernist";
        student2.age=23;
        student2.university="KRSU";
        student2.profession="Lawyer";
        System.out.println("Student 3:\n name: "+student2.name+",\n age: "+student2.age+",\n university: "
                +student2.university+",\n profession: "+student2.profession);
        System.out.println();
    }
}
