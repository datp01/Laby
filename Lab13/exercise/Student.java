package exercise;

public class Student {
    int id;
    String name;
    double mark;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int id, String name, double mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student[" +
                "Id: " + id +
                ", Name: '" + name + '\'' +
                ", Mark: " + mark +
                ']';
    }
}
