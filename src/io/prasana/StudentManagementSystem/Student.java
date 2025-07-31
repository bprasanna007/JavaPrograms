package io.prasana.StudentManagementSystem;


    public class Student {
        private String name;
        private int rollNumber;
        private String grade;

        public Student(String name, int rollNumber, String grade) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.grade = grade;
        }

        public String toString() {
            return name + "," + rollNumber + "," + grade;
        }

        public static Student fromString(String line) {
            String[] parts = line.split(",");
            return new Student(parts[0], Integer.parseInt(parts[1]), parts[2]);
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public String getName() {
            return name;
        }

        public String getGrade() {
            return grade;
        }
    }


