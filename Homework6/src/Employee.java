



public class Employee extends Person {
    protected double daySalary;

    protected Employee(String name, int age, boolean isMan, double daySalary){
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    protected void calculateOvertime(double hours){
        double sum;
        if(getAge()<18){
            System.out.println(getName() + " is not allowed to work overtime!!!");
        } else {
            sum = hours*daySalary*1.5;
            System.out.println(getName() + " will receive " + sum + " lv for overtime!");
        }
    }

    protected void showEmployeeInfo(){

            System.out.println(getName() + " is " + getAge() + " years old ." + "Is man - " + isMan + ". " + getName() + "'s day salary is " + daySalary);

    }
}
