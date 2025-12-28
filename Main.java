import java.util.Scanner;

public class Main{
  public static void main(String[] args) {

    Human human_employee = new Employee("Alexey", 20, 12);
    human_employee.greet();
    human_employee.think();

    Iwork worker1 = new Employee ("Max", 19, 12);
    worker1.work();
    worker1.relax();

    Istudy student_employee = new Employee ("Julia", 18, 6);
    student_employee.study();
    student_employee.cheat();
  }
}