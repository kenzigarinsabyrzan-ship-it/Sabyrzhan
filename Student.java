public class Student extends Human {
    private String grade;
    private float weight;

    public Student(String name, int age, boolean isWorking, String grade, float weight) {
        super(name, age, isWorking);
        this.grade = grade;
        this.weight = weight;
    }
    public Student() {}
    public String getGrade(){
        return this.grade;
    }
    public float getWeight(){
        return this.weight;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }

    @Override
    public void speak(){
        System.out.println("Student is speaking");
    }
}
