

public class Employee extends Person {
    double daySalary;

    Employee(String name, int age, boolean isMan, double daySalary){
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    void calculateOvertime(double hours){
        double sum;
        if(age<18){
            System.out.println(name + " is not allowed to work overtime!!!");
        } else {
            sum = hours*daySalary*1.5;
            System.out.println(name + " will receive " + sum + " lv for overtime!");
        }
    }

    void showEmployeeInfo(){

            System.out.println(name + " is " + age + " years old ." + "Is man - " + isMan + ". " + name + "'s day salary is " + daySalary);

    }
}
