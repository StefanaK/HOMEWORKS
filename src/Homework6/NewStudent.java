package Homework6;


public class NewStudent extends Person {
    protected double score;

    protected NewStudent(String name, int age, boolean isMan, double score){
        super(name, age, isMan);
        this.score = score;
    }

    protected void showStudentInfo(){
        System.out.println(getName() + " is " + getAge() + " years old ." + "Is man - " + isMan + ". " + getName() + "'s grade is " + score);
    }
}
