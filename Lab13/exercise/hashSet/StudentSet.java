package exercise.hashSet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import exercise.Student;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class StudentSet {
    Set<Student> set = new HashSet<>();

    Scanner sc;

    public StudentSet() {
        this.set.add(new Student(1, "Tùng Anh", 9.3));
        this.set.add(new Student(2, "Ngọc Anh", 4.3));
        this.set.add(new Student(3, "Mai Anh", 5.3));
    }

    public void addStudents(Student student) {
        this.set.add(student);
    }

    public void input() {
        System.out.print("Enter student name: ");
        String name = this.sc.nextLine();
        System.out.print("Enter student ID: ");
        Integer id = this.sc.nextInt();
        System.out.print("Enter student mark: ");
        Double mark = this.sc.nextDouble();
        Student student = new Student(id, name, mark);
        this.addStudents(student);
    }

    public void showAll() {
        for (Student student :
                set) {
            System.out.println(student);
        }
    }

    public void writeFile() throws IOException {
        Gson gson = (new GsonBuilder()).setPrettyPrinting().create();
        Writer writer = Files.newBufferedWriter(Paths.get("StudentHashSet.json"));
        gson.toJson(this.set, writer);
        writer.close();
    }

    public void  readFile() throws IOException {
        new Gson();
        FileReader reader = new FileReader("StudentHashSet.json");
        this.set = (HashSet)(new Gson()).fromJson(reader, (new TypeToken<List<Student>>() {
        }).getType());
        reader.close();
    }

    public void searchStudent() throws IOException {
        System.out.println("Enter student name: "); String name = sc.nextLine();
        File file = new File("StudentArrayList.json");
        new Student(name);

        try {
            Scanner sc = (new Scanner(file)).useDelimiter(", ");

            while (sc.hasNext()) {
                String lineFromFile = sc.nextLine();
                if (lineFromFile.contains(name)) {
                    System.err.println("I found " + name);
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Cannot write to file: " + file.toString());
        }
    }

    public String inputName(){
        System.out.println("Enter name: "); String name = sc.nextLine();
        return name;
    }

    public double inputMark(){
        System.out.println("Enter mark: "); double mark = sc.nextDouble();
        return mark;
    }

//    public void edit(int id) throws IOException {
//        boolean isExisted = false;
//        int size = set.size();
//        for (int i = 0; i < size; i++) {
//            if (set.contains(id)) {
//                isExisted = true;
//                set.contains(id).setName(inputName());
//                set.contains(id).setMark(inputMark());
//                writeFile();
//                break;
//            }
//        }
//        if (!isExisted) {
//            System.out.printf("id = %d not existed.\n", id);
//        }
//    }
//
//    public void delete(int id) throws IOException {
//        Student student = null;
//        int size = set.size();
//        for (int i = 0; i < size; i++) {
//            if (set.contains(id)) {
//                break;
//            }
//        }
//        if (student != null) {
//            set.remove(student);
//            writeFile();
//        } else {
//            System.out.printf("id = %d not existed.\n", id);
//        }
//    }
}
