public class College {
    public static void main(String[] args) {

        //Person stefi = new Person("Stefana Kazandzhieva", 33, false);

        Student Ivan = new Student("Ivan Ivanov", "Pharmacy", 21);
        Ivan.grade = 5.20;

        Student Petar = new Student();
        Petar.name = "Petar Mihaylov";
        Petar.subject = "Mathematics";
        Petar.age = 20;
        Petar.grade  = 4.50;

        Student Krasi = new Student("Krasimir Stoyanov", "Marketing", 26);
        Krasi.grade = 4.80;

        Student Mariya = new Student("Mariya Uzunova", "Marketing", 21);
        Mariya.grade = 5.40;

        Student Galya = new Student("Galya Kirilova", "Marketing", 22);
        Galya.grade = 5.60;

        Student Anton = new Student("Anton Tzarev", "Marketing", 23);
        Anton.grade = 5.0;

        Student Alex = new Student("Alexander Tomov", "Marketing",23);
        Alex.grade = 5.20;

        Student Rosi = new Student("Rositsa Dieva", "Marketing", 25);

        StudentGroup Marketing = new StudentGroup("Marketing");

        //stefi.showPersonInfo();

        System.out.println(Ivan.toString());

        System.out.println();

        Marketing.addStudent(Ivan);
        Marketing.addStudent(Mariya);
        Marketing.addStudent(Petar);
        Marketing.addStudent(Rosi);
        Marketing.addStudent(Alex);
        Marketing.addStudent(Anton);
        Marketing.addStudent(Krasi);
        Marketing.addStudent(Galya);

        Marketing.printStudentsInGroup();

        String bestStudent = Marketing.theBestStudent();
        System.out.println("The best student is "+ bestStudent);

        Marketing.emptyGroup();

        Marketing.addStudent(Galya);

        System.out.println(Petar.receiveScholarship(5, 100));
        Rosi.upYear();
        System.out.println(Rosi.receiveScholarship(5.40, 150));
    }
}
