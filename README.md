📚 Student Management System (Java)

A fully-functional Student Management System developed in Java implementing:

✔ Exception Handling

✔ Custom Exceptions

✔ File Handling (FileReader, BufferedReader, FileWriter, RandomAccessFile)

✔ Multithreading (Simulated Loading Screen)

✔ CRUD Operations (Add, View, Search, Delete)

✔ Sorting (By Marks)

✔ Persistent Storage using students.txt

🚀 Features 🔹 1. Add Student

Enter Name, Course, and Marks

Marks validated using try-catch

Empty fields handled

Automatically stored in ArrayList

🔹 2. View All Students

Displays all records neatly in a tabular format

Handles case when no students exist

🔹 3. Search Student by Name

Case-insensitive

Throws & handles StudentNotFoundException

🔹 4. Delete Student by Name

Removes record if found

If not found → custom exception

🔹 5. Sort Students by Marks

Uses Collections.sort()

Shows sorted list in descending order

🔹 6. Save & Exit

Saves all data into students.txt

File is automatically created inside the project folder

Shows file details like size and path

Uses try-with-resources for safety

🧵 Multithreading

A small animation simulating a loading screen:

Loading data, please wait...

Implemented using:

Thread loader = new Thread(() -> { ... }); loader.start(); loader.join();

⚠️ Exception Handling

The system handles:

Invalid marks

Empty input

File not found

Error in reading file

RandomAccessFile error

StudentNotFoundException (Custom)

📁 File Handling

📦 Folder Structure JavaLab Ass4/ │── Main.java │── Student.java │── StudentManager.java │── StudentNotFoundException.java │── students.txt (auto generated)

▶️ How to Run Using Terminal cd "JavaLab Ass4" javac *.java java Main

Using VS Code Open folder Run → "Run Java"

📝 Sample Output ===== Capstone Student Menu =====

Add Student
View All Students
Search by Name
Delete by Name
Sort by Marks
Save and Exit Enter choice:
🎯 Learning Outcomes

Understanding of Exception Handling Practical use of File Handling Experience with Multithreading Building a real-world menu-driven Java application

About
No description, website, or topics provided.
Resources
 Readme
 Activity
Stars
 0 stars
Watchers
 0 watching
Forks
 0 forks
Report repository
Releases
No releases published
Packages
No packages published
Languages
Java
100.0%
Footer
