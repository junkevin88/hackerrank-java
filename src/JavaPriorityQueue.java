import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */


class Student1 implements Comparable<Student1> {
    private int id;
    private String name;
    private double cgpa;

    public Student1(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student1 o) {
        if (this.cgpa == o.cgpa) {
            if (this.name.equals(o.name)) {
                return this.id - o.id;
            } else {
                return this.name.compareTo(o.name);
            }
        } else {
            return (int) (o.cgpa - this.cgpa);
        }
    }

}

class Priorities {
    public List<Student1> getStudents(List<String> events) {
        List<Student1> students = new ArrayList<>();
        for (String event : events) {
            String[] tokens = event.split(" ");
            if (tokens[0].equals("ENTER")) {
                students.add(new Student1(Integer.parseInt(tokens[3]), tokens[1], Double.parseDouble(tokens[2])));
            } else {
                students.sort(null);
                students.remove(0);
            }
        }
        students.sort(null);
        return students;
    }
}


public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student1> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student1 st: students) {
                System.out.println(st.getName());
            }
        }
    }
}