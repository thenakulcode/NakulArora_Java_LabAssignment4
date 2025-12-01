import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    @SuppressWarnings("resource")
    public void addStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students.add(new Student(roll, name, email, course, marks));
        System.out.println("Student Added Successfully!\n");
    }

    public void viewStudents() {
        System.out.println("===== Student List =====");

        Iterator<Student> itr = students.iterator();

        while (itr.hasNext()) {
            Student s = itr.next();
            System.out.println("Roll No: " + s.getRollNo());
            System.out.println("Name: " + s.getName());
            System.out.println("Email: " + s.getEmail());
            System.out.println("Course: " + s.getCourse());
            System.out.println("Marks: " + s.getMarks());
            System.out.println("-------------------------");
        }
    }

    public void searchByName(String name) {
        boolean found = false;

        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println("Student Found:");
                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student Not Found!");
        }
    }

    public void deleteByName(String name) {
        Iterator<Student> itr = students.iterator();
        boolean removed = false;

        while (itr.hasNext()) {
            if (itr.next().getName().equalsIgnoreCase(name)) {
                itr.remove();
                removed = true;
                System.out.println("Student Removed Successfully!");
            }
        }

        if (!removed) {
            System.out.println("Student Not Found!");
        }
    }

    public void sortByMarks() {
        students.sort((s1, s2) -> Double.compare(s2.getMarks(), s1.getMarks()));

        System.out.println("Sorted Student List by Marks:");
        viewStudents();
    }
}
