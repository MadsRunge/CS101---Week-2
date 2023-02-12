package src.Modelling;

public class ITAdmin extends Employee{
    String itDuties;


    public  ITAdmin(String name, String job, String itDuties, int salary){
        super(name, job, salary);
        this.itDuties = itDuties;

    }
}
