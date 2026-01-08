public class Employee extends Human implements Istudy, Iwork {

    private int work_hours;

    public Employee(String name, int age, int work_hours){
        super(name, age);
        this.work_hours = work_hours;
    }

    @Override
    public void work(){
        System.out.println(name + " is working right now");
    }

    @Override
    public void relax(){
        System.out.println(name + " is relaxing right now");
    }

    @Override
    public void study(){
        System.out.println(name + " is studying how to do his work");
    }

    @Override
    public void cheat(){
        System.out.println(name + " is not doing his work");
    }

    @Override
    public void showschool() {
        System.out.println(name + " Is showing his old school");
    }

    @Override
    public void greet(){
        System.out.println("Hello. My name is " + name);
    }
}
