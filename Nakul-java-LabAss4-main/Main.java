import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        String filename = "students.txt";

        ArrayList<Student> list = FileUtil.readStudents(filename);

        System.out.println("Loaded students from file:");
        for (Student s : list) {
            System.out.println(s);
        }

        FileUtil.showFileAttributes(filename);
        FileUtil.readRandom(filename);

        StudentManager manager = new StudentManager(list);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Capstone Student Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by Name");
            System.out.println("4. Delete by Name");
            System.out.println("5. Sort by Marks");
            System.out.println("6. Save and Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> manager.addStudent();
                case 2 -> manager.viewStudents();
                case 3 -> {
                    System.out.print("Enter Name: ");
                    manager.searchByName(sc.nextLine());
                }
                case 4 -> {
                    System.out.print("Enter Name: ");
                    manager.deleteByName(sc.nextLine());
                }
                case 5 -> manager.sortByMarks();
                case 6 -> {
                    FileUtil.writeStudents(filename, list);
                    System.out.println("Data Saved. Exiting...");
                    return;
                }
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}
