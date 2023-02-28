import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */

import java.util.Comparator;
import java.util.PriorityQueue;

class Student1 {
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
}

class Priorities {
    public List<Student1> getStudents(List<String> events) {
        PriorityQueue<Student1> pq = new PriorityQueue<>(Comparator.comparing(Student1::getCgpa).reversed()
                .thenComparing(Student1::getName)
                .thenComparing(Student1::getId));
        List<Student1> result = new ArrayList<>();
        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                Student1 student = new Student1(id, name, cgpa);
                pq.offer(student);
            } else if (parts[0].equals("SERVED")) {
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        return result;
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