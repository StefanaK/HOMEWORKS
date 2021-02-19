package Homework4;

public class Student {
    public  String name;
    public String subject;
    public double grade;
    int yearInCollege;
    public int age;
    boolean isDegree;
    double money;

    public Student() {
        this.grade = 4.0;
        this.yearInCollege = 1;
        this.isDegree = false;
        this.money = 0;
    }

    public Student(String newName, String newSubject, int newAge) {
        this();
        this.name = newName;
        this.subject =newSubject;
        this.age = newAge;
    }

    public String toString(){
        return this.name + " from subject " + this.subject + "is " + this.age + " years old " + "and is " + this.yearInCollege + " year in the college." +
                " The grade of this student is " + this.grade + ". " + this.name + " is degree - " + this.isDegree + ". This student has " + this.money + " leva.";
    }

    public void upYear() {
        if (!isDegree && yearInCollege<3) {
            yearInCollege++;
            System.out.println(name + " is " + yearInCollege + " year in the college!");
        } else {
                isDegree = true;
                System.out.println("The student " + name + " is graduated!");
            }
        }


    public double receiveScholarship(double min, double amount) {
        if (age < 30 && grade >= min) {
            money += amount;
            System.out.print(name + " will receive scholarship of: ");
            return money;
        } else {
            System.out.print(name + " will not receive scholarship of: ");
        }

        return amount;
    }
}
