package org.example.timbChalka.ARRAY;

public class ArraySample1 {
    class Students{
        int rollNo;
        String name;
        int mark;
    }

    public void main(String[] args) {
        Students students1 = new Students();
        students1.rollNo = 1;
        students1.name = "Tim";
        students1.mark = 88;
        System.out.println(students1.name);

        Students students2 = new Students();
        students2.rollNo = 2;
        students2.name = "Phil";
        students2.mark = 99;
        System.out.println(students2.name);

        Students students3 = new Students();
        students3.rollNo = 3;
        students3.name = "James";
        students3.mark = 68;
        System.out.println(students3.name);

        System.out.println("Name"+" : "+ " roll number");
        System.out.println(students3.name+" : "+students3.rollNo);
        System.out.println(students2.name+" : "+students2.rollNo);
        System.out.println(students1.name+" : "+students1.rollNo);

        System.out.println("to put them into an Array");
        Students students[] = new Students[3];
        students[0] = students1;
        students[1] = students2;
        students[2] = students3;
        System.out.println(students[0].name +" : "+students[0].rollNo);
        System.out.println(students[1].name +" : "+students[1].rollNo);
        System.out.println(students[2].name +" : "+students[2].rollNo);
        System.out.println("OR");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name +" : "+students[i].rollNo);
        }

    }
}
