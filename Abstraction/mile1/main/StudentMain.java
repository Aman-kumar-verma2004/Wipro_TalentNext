package Abstraction.mile1.main;

import Abstraction.mile1.bean.Student;
import Abstraction.mile1.service.*;
import Abstraction.mile1.exception.*;

public class StudentMain {
    static Student data[] = new Student[4];

    public static void main(String[] args) {
        data[0] = new Student("Sekar", new int[]{85,75,95});
        data[1] = new Student(null, new int[]{11,22,33});
        data[2] = null;
        data[3] = new Student("Manoj", null);

        StudentService ss = new StudentService();
        StudentReport sr = new StudentReport();

        for (int i = 0; i < data.length; i++) {
            try {
                String valid = sr.validate(data[i]);
                if (valid.equals("VALID")) {
                    System.out.println("GRADE = " + sr.findGrades(data[i]));
                }
            } catch (NullNameException | NullMarksArrayException | NullStudentObjectException e) {
                System.out.println(e);
            }
        }

        System.out.println("Number of objects with marks array as null = " + ss.findNumberOfNullMarksArray(data));
        System.out.println("Number of objects with name as null = " + ss.findNumberOfNullName(data));
        System.out.println("Number of objects that are entirely null = " + ss.findNumberOfNullObjects(data));
    }
}
