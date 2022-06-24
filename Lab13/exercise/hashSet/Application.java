package exercise.hashSet;

import exercise.Menu;
import exercise.Student;
import exercise.linkedList.StudentLinkedList;

import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StudentSet set = new StudentSet();
        Menu menu = new Menu();

        long start, end, timeElapsed;
        start = System.nanoTime();
        set.addStudents(new Student(10, "Rinuwu", 4));
        set.addStudents(new Student(11, "Rinuwu", 4));
        set.addStudents(new Student(12, "Rinuwu", 4));
        set.addStudents(new Student(13, "Rinuwu", 4));
        set.addStudents(new Student(14, "Rinuwu", 4));
        set.addStudents(new Student(15, "Rinuwu", 4));
        set.addStudents(new Student(16, "Rinuwu", 4));
        set.addStudents(new Student(17, "Rinuwu", 4));
        set.addStudents(new Student(18, "Rinuwu", 4));
        set.addStudents(new Student(19, "Rinuwu", 4));
        set.addStudents(new Student(20, "Rinuwu", 4));
        set.addStudents(new Student(21, "Rinuwu", 4));
        set.addStudents(new Student(22, "Rinuwu", 4));
        set.addStudents(new Student(23, "Rinuwu", 4));
        set.addStudents(new Student(24, "Rinuwu", 4));
        set.addStudents(new Student(25, "Rinuwu", 4));
        set.addStudents(new Student(26, "Rinuwu", 4));
        set.addStudents(new Student(27, "Rinuwu", 4));
        set.addStudents(new Student(28, "Rinuwu", 4));
        set.addStudents(new Student(29, "Rinuwu", 4));
        set.addStudents(new Student(30, "Rinuwu", 4));
        end = System.nanoTime();
        timeElapsed = end - start;


        while (true) {
            menu.menu();
            int choose = sc.nextInt();
            switch (choose) {
                case 1 -> set.input();
                case 2 -> {
                    System.out.println("Enter id: ");
                    int id = sc.nextInt();
                    //set.edit(id);
                }
                case 3 -> {
                    System.out.println("Enter id student: ");
                    int id = sc.nextInt();
                    //set.delete(id);
                }
                case 4 -> set.searchStudent();
                case 5 -> set.showAll();
                case 6 -> set.writeFile();
                case 7 -> set.readFile();
                case 8 -> System.out.println("Sử dụng HashSet: " + timeElapsed);
                case 9 -> System.exit(0);
            }
        }
    }
}
