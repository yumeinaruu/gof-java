package fabric_pattern;

import fabric_pattern.fabric.Course;
import fabric_pattern.fabric.JavaCourse;
import fabric_pattern.fabric.PythonCourse;
import fabric_pattern.items.Developer;
import fabric_pattern.items.JavaDev;

public class Main {
    public static void main(String[] args) {
        Course course = new JavaCourse();
        course.courseInfo();

        System.out.println();

        Course course1 = new PythonCourse();
        course1.courseInfo();
    }
}
