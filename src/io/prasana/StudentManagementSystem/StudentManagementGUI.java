package io.prasana.StudentManagementSystem;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class StudentManagementGUI {
    JFrame frame;
    JTextField nameField, rollField, gradeField;
    JTextArea displayArea;

    public StudentManagementGUI() {
        frame = new JFrame("Student Management System");

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 30, 80, 25);
        frame.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(120, 30, 150, 25);
        frame.add(nameField);

        JLabel rollLabel = new JLabel("Roll No:");
        rollLabel.setBounds(30, 70, 80, 25);
        frame.add(rollLabel);

        rollField = new JTextField();
        rollField.setBounds(120, 70, 150, 25);
        frame.add(rollField);

        JLabel gradeLabel = new JLabel("Grade:");
        gradeLabel.setBounds(30, 110, 80, 25);
        frame.add(gradeLabel);

        gradeField = new JTextField();
        gradeField.setBounds(120, 110, 150, 25);
        frame.add(gradeField);

        JButton addBtn = new JButton("Add Student");
        addBtn.setBounds(30, 150, 120, 30);
        frame.add(addBtn);

        JButton viewBtn = new JButton("View All");
        viewBtn.setBounds(160, 150, 110, 30);
        frame.add(viewBtn);

        JButton deleteBtn = new JButton("Delete by Roll");
        deleteBtn.setBounds(30, 190, 160, 30);
        frame.add(deleteBtn);

        displayArea = new JTextArea();
        displayArea.setBounds(300, 30, 300, 200);
        frame.add(displayArea);

        frame.setSize(650, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Button actions
        addBtn.addActionListener(e -> addStudent());
        viewBtn.addActionListener(e -> viewStudents());
        deleteBtn.addActionListener(e -> deleteStudent());
    }

    private void addStudent() {
        try {
            String name = nameField.getText().trim();
            String rollStr = rollField.getText().trim();
            String grade = gradeField.getText().trim();

            if (name.isEmpty() || rollStr.isEmpty() || grade.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "All fields are required.");
                return;
            }

            int roll = Integer.parseInt(rollStr);
            Student s = new Student(name, roll, grade);
            StudentFileHandler.saveStudent(s);
            JOptionPane.showMessageDialog(frame, "Student added!");
            nameField.setText("");
            rollField.setText("");
            gradeField.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
        }
    }

    private void viewStudents() {
        try {
            List<Student> students = StudentFileHandler.loadAllStudents();
            displayArea.setText("");
            for (Student s : students) {
                displayArea.append(s.getName() + " | Roll: " + s.getRollNumber() + " | Grade: " + s.getGrade() + "\n");
            }
        } catch (IOException ex) {
            displayArea.setText("Error loading students.");
        }
    }

    private void deleteStudent() {
        String rollStr = JOptionPane.showInputDialog(frame, "Enter roll number to delete:");
        try {
            int roll = Integer.parseInt(rollStr);
            StudentFileHandler.deleteStudent(roll);
            JOptionPane.showMessageDialog(frame, "Student deleted if existed.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new StudentManagementGUI();
    }
}

