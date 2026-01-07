public final class Student extends Human implements Istudy {

    public final String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public void greet() {
        System.out.println("Greetings! My name is " + name);
    }

    @Override
    public void study() {
        System.out.println(name + " is studying right now");
    }

    @Override
    public void cheat() {
        System.out.println(name + " is cheating on exam");
    }

    public final void showschool() {
        System.out.println("Student is showing his " + school);
    }
}

