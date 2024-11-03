import java.util.ArrayList;

class StudentManagementSystem {
    private ArrayList<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(String id, String name, int age) {
        students.add(new Student(id, name, age));
        System.out.println("Student added: " + name);
    }

    public void viewStudents() {
        System.out.println("\nList of Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void searchStudent(String id) {
        for (Student student : students) {
            if (student.getId().equalsIgnoreCase(id)) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void deleteStudent(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equalsIgnoreCase(id)) {
                System.out.println("Deleting student: " + students.get(i));
                students.remove(i);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
}