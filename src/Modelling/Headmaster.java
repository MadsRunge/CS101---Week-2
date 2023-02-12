package src.Modelling;

public class Headmaster extends Employee{
    String managementDuties;


    public Headmaster(String name, String job, int salary, String managementDuties){
        super(name, job, salary);
        this.managementDuties = managementDuties;
    }

}
