import com.sun.source.tree.IfTree;

public class StudentGroup {
    String groupSubject;
    Student[] students;
    int freePlaces;

    StudentGroup() {
        this.students = new Student[5];
        this.freePlaces = 5;
    }

    StudentGroup(String subject) {
        this();
        this.groupSubject = subject;
    }

    void addStudent(Student s) {

        if (s.subject.equals(groupSubject) && freePlaces > 0){
            students[students.length-freePlaces] = s;
            freePlaces--;

                System.out.println(s.name + " is added to StudentGroup: " + groupSubject);
                System.out.println(freePlaces + " places available in " + groupSubject);


            } else {
                if (freePlaces == 0) {
                    System.out.println(s.name + " can't be added because there is no enough places in the group " + groupSubject);
                }
            }

            if (s.subject != groupSubject) {
                System.out.println(s.name + " studies " + s.subject + " and can't be add to StudentGroup: " + groupSubject);

            }
            System.out.println();

        }



    void emptyGroup() {
        System.out.println();
        students = new Student[5];
        freePlaces = 5;
        System.out.println("There is another " + freePlaces + " places in group Marketing");
        System.out.println();
    }

    String theBestStudent() {
        Student max = students[0];
        for (int i = 0; i < students.length; i++) {
            if (students[i].grade > max.grade) {
                max.grade = students[i].grade;
            }
        }
        return max.name;
    }

       void printStudentsInGroup () {
           System.out.println();
           for (int i = 0; i < students.length; i++) {
               System.out.println(students[i].toString());
           }
           System.out.println();
    }
}
