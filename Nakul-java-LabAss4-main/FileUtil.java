import java.io.*;
import java.util.*;

public class FileUtil {

    // Reads all student records from file
    public static ArrayList<Student> readStudents(String filename) {
        ArrayList<Student> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int roll = Integer.parseInt(data[0]);
                String name = data[1];
                String email = data[2];
                String course = data[3];
                double marks = Double.parseDouble(data[4]);

                list.add(new Student(roll, name, email, course, marks));
            }

        } catch (IOException e) {
            System.out.println("File not found or error reading file.");
        }
        return list;
    }

    // Saves student data to file
    public static void writeStudents(String filename, ArrayList<Student> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {

            for (Student s : list) {
                bw.write(s.toString());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    // Display file attributes
    public static void showFileAttributes(String filename) {
        File file = new File(filename);
        System.out.println("File Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length() + " bytes");
    }

    // Read random record using RandomAccessFile
    public static void readRandom(String filename) {
        System.out.println("\nReading file using RandomAccessFile:");
        try (RandomAccessFile raf = new RandomAccessFile(filename, "r")) {
            raf.seek(0);  // read from beginning
            System.out.println(raf.readLine());
        } catch (IOException e) {
            System.out.println("RandomAccessFile Error.");
        }
    }
}
