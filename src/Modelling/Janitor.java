package src.Modelling;

public class Janitor extends Employee {
    String duties;

    public Janitor(String name, String job, int salary, String duties){
        super(name,job, salary);
        this.duties = duties;
    }

}
