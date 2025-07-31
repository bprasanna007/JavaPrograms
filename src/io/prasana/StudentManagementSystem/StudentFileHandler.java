package io.prasana.StudentManagementSystem;

import java.io.*;
import java.util.*;

public class StudentFileHandler {
    private static final String FILE_NAME = "students.txt";

    public static void saveStudent(Student student) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true));
        bw.write(student.toString());
        bw.newLine();
        bw.close();
    }

    public static List<Student> loadAllStudents() throws IOException {
        List<Student> students = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
        String line;
        while ((line = br.readLine()) != null) {
            students.add(Student.fromString(line));
        }
        br.close();
        return students;
    }

    public static void deleteStudent(int rollNumber) throws IOException {
        List<Student> all = loadAllStudents();
        List<Student> updated = new ArrayList<>();
        for (Student s : all) {
            if (s.getRollNumber() != rollNumber) {
                updated.add(s);
            }
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME));
        for (Student s : updated) {
            bw.write(s.toString());
            bw.newLine();
        }
        bw.close();
    }
}

