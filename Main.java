import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Human human = new Human("Oleg", 20, true);
    Employee employee = new Employee("Andrew", 22, true, "designer", 3.2f);
    Student student = new Student();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Student's name: ");
    student.setName(scanner.next());
    System.out.println("Student's age: ");
    student.setAge(scanner.nextInt());
    System.out.println("Is student working?: ");
    student.setIsWorking(scanner.nextBoolean());
    System.out.println("Student's grade: ");
    student.setGrade(scanner.next());
    System.out.println("Student's weight: ");
    student.setWeight(scanner.nextFloat());

    System.out.println("#Human");
    System.out.println("Name: " + human.getName() + "\nAge: " + human.getAge() +
            "\nIs working: " + human.getIsWorking()
    );
    human.work();
    human.speak();

    System.out.println("#Employee");
    System.out.println("Name: " + employee.getName() + "\nAge: " + employee.getAge() +
            "\nIs working: " + employee.getIsWorking()
    );
    employee.work();
    employee.speak();

    System.out.println("#Student");
    System.out.println("Name: " + student.getName() + "\nAge: " + student.getAge() +
            "\nIs working: " + employee.getIsWorking()
    );
    student.work();
    student.speak();
  }
}