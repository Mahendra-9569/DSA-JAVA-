import java.util.PriorityQueue;
public class priority {
    static class Student implements Comparable<Student> {
        int roll;
        String name;
        int marks;

        public Student(int roll, String name, int marks) {
            this.roll = roll;
            this.name = name;
            this.marks = marks;
        }

        @Override
        public int compareTo(Student other) {
       
            return this.marks - other.marks;
        }
        
    }
    public static void main(String args[]) {
       
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student(1, "John", 85));
        pq.add(new Student(2, "Alice", 90));
        pq.add(new Student(3, "Bob", 80));

        while (!pq.isEmpty()) {
            Student s = pq.poll();
            System.out.println("Roll: " + s.roll + ", Name: " + s.name + ", Marks: " + s.marks);
        }
    }
}
