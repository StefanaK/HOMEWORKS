

public class StudentDemo {

    public static void main(String[] args) {
        Student Ivan = new Student("Ivan Ivanov", "Pharmacy", 21);

        Student Petar = new Student();
        Petar.name = "Petar Mihaylov";
        Petar.subject = "Mathematics";
        Petar.age = 20;

        Student Krasi = new Student("Krasimir Stoyanov", "Marketing", 26);

        System.out.println(Ivan.receiveScholarship(4.0, 50));
        System.out.println(Ivan.receiveScholarship(4.0, 50));

        System.out.println();

        Petar.upYear();
        Petar.upYear();
        Petar.upYear();

        System.out.println();

        System.out.println(Krasi.receiveScholarship(5.0, 60));
        Krasi.upYear();

    }
}
