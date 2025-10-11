package Abstraction.mile1.service;

import Abstraction.mile1.bean.Student;

public class StudentService {

    public int findNumberOfNullMarksArray(Student[] s) {
        int count = 0;
        if (s == null) return count;
        for (Student obj : s) {
            if (obj != null && obj.getMarks() == null) count++;
        }
        return count;
    }

    public int findNumberOfNullName(Student[] s) {
        int count = 0;
        if (s == null) return count;
        for (Student obj : s) {
            if (obj != null && obj.getName() == null) count++;
        }
        return count;
    }

    public int findNumberOfNullObjects(Student[] s) {
        int count = 0;
        if (s == null) return count;
        for (Student obj : s) {
            if (obj == null) count++;
        }
        return count;
    }
}
