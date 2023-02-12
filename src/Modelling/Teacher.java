package src.Modelling;

public class Teacher extends Employee{
    String classes;

    String subject;


    public Teacher(String name, String job,int salary, String classes, String subject){
        super(name, job, salary);
        this.classes = classes;
        this.subject = subject;

    }
}
