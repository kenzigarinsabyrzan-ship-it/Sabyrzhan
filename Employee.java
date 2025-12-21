public class Employee extends Human {
    private String status;
    private float height;

    public Employee(String name, int age, boolean isWorking, String status, float height){
        super(name, age, isWorking);
        this.status = status;
        this.height = height;
    }
    public Employee() {}
    public String getStatus(){
        return this.status;
    }
    public float getHeight(){
        return this.height;
    }

    public void setStatus(String status){
        this.status = status;
    }
    public void setHeight(float height){
        this.height = height;
    }

    @Override
    public void speak(){
        System.out.println("Employee is speaking");
    }
}
