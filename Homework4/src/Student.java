public class Student {
    String name;
    String subject;
    double grade;
    int yearInCollege;
    int age;
    boolean isDegree;
    double money;

    Student() {
        this.grade = 4.0;
        this.yearInCollege = 1;
        this.isDegree = false;
        this.money = 0;
    }

    Student(String newName, String newSubject, int newAge) {
        this();
        this.name = newName;
        this.subject =newSubject;
        this.age = newAge;
    }

    public String toString(){
        return this.name + " from subject " + this.subject + "is " + this.age + " years old " + "and is " + this.yearInCollege + " year in the college." +
                " The grade of this student is " + this.grade + ". " + this.name + " is degree - " + this.isDegree + ". This student has " + this.money + " leva.";
    }

    void upYear() {
        if (!isDegree && yearInCollege<3) {
            yearInCollege++;
            System.out.println(name + " is " + yearInCollege + " year in the college!");
        } else {
                isDegree = true;
                System.out.println("The student " + name + " is graduated!");
            }
        }


    double receiveScholarship(double min, double amount) {
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
