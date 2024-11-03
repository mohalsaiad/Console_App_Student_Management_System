import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();
        String choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Student Age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    sms.addStudent(id, name, age);
                    break;
                case "2":
                    sms.viewStudents();
                    break;
                case "3":
                    System.out.print("Enter Student ID to search: ");
                    String searchId = scanner.nextLine();
                    sms.searchStudent(searchId);
                    break;
                case "4":
                    System.out.print("Enter Student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    sms.deleteStudent(deleteId);
                    break;
                case "5":
                    System.out.println("Exiting the Student Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (!choice.equals("5"));

        scanner.close();
    }
}