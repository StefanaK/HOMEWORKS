

public class newStudent extends Person{
    double score;

    newStudent(String name, int age, boolean isMan, double score){
        super(name, age, isMan);
        this.score = score;
    }

    void showStudentInfo(){
        System.out.println(name + " is " + age + " years old ." + "Is man - " + isMan + ". " + name + "'s grade is " + score);
    }
}
