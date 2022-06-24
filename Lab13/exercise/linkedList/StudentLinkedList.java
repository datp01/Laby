package exercise.linkedList;

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
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentLinkedList {
    List<Student> list = new LinkedList<>();

    Scanner sc;

    public StudentLinkedList() {
        this.sc = new Scanner(System.in);
        this.list.add(new Student(1, "Tùng Anh", 9.3));
        this.list.add(new Student(2, "Ngọc Anh", 4.3));
        this.list.add(new Student(3, "Mai Anh", 5.3));
    }

    public void addStudents(Student student) {
        this.list.add(student);
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

    public String inputName(){
        System.out.println("Enter name: "); String name = sc.nextLine();
        return name;
    }

    public double inputMark(){
        System.out.println("Enter mark: "); double mark = sc.nextDouble();
        return mark;
    }

    public void edit(int id) throws IOException {
        boolean isExisted = false;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getId() == id) {
                isExisted = true;
                list.get(i).setName(inputName());
                list.get(i).setMark(inputMark());
                writeFile();
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        }
    }

    public void showAll() {
        for (Student student :
                list) {
            System.out.println(student);
        }
    }

    public void writeFile() throws IOException {
        Gson gson = (new GsonBuilder()).setPrettyPrinting().create();
        Writer writer = Files.newBufferedWriter(Paths.get("StudentLinkedList.json"));
        gson.toJson(this.list, writer);
        writer.close();
    }

    public void  readFile() throws IOException {
        new Gson();
        FileReader reader = new FileReader("StudentLinkedList.json");
        this.list = (LinkedList)(new Gson()).fromJson(reader, (new TypeToken<List<Student>>() {
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

    public void delete(int id) throws IOException {
        Student student = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getId() == id) {
                student = list.get(i);
                break;
            }
        }
        if (student != null) {
            list.remove(student);
            writeFile();
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }
}
