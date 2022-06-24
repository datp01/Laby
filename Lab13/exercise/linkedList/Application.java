package exercise.linkedList;

import exercise.Menu;
import exercise.Student;

import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();
        Menu menu = new Menu();

        long start, end, timeElapsed;
        start = System.nanoTime();
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        list.addStudents(new Student(50, "Rinuwu", 4));
        end = System.nanoTime();
        timeElapsed = end - start;

        while (true) {
            menu.menu();
            int choose = sc.nextInt();
            switch (choose) {
                case 1 -> list.input();
                case 2 -> {
                    System.out.println("Enter id: ");
                    int id = sc.nextInt();
                    list.edit(id);
                }
                case 3 -> {
                    System.out.println("Enter id student: ");
                    int id = sc.nextInt();
                    list.delete(id);
                }
                case 4 -> list.searchStudent();
                case 5 -> list.showAll();
                case 6 -> list.writeFile();
                case 7 -> list.readFile();
                case 8 -> System.out.println("Sử dụng LinkedList: " + timeElapsed);
                case 9 -> System.exit(0);
            }
        }
    }
}

