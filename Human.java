public class Human {
    private String name;
    private int age;
    private boolean isWorking;

    public Human (String name, int age, boolean isWorking){
        this.name = name;
        this.age = age;
        this.isWorking = isWorking;
    }
    public Human() {}

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public boolean getIsWorking(){
        return this.isWorking;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setIsWorking(boolean isWorking){
        this.isWorking = isWorking;
    }

    public void work(){
        System.out.println("Human is working");
    }
    public void speak(){
        System.out.println("Human is speaking");
    }
}
