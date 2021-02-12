
public class DemoPerson {
    public static void main(String[] args) {
        Person[] arrPerson = new Person[10];

        Person bobi = new Person("Borislav Georgiev", 25, true);
        Person stoyan = new Person("Stoyan Georgiev", 17, true);

        newStudent desi = new newStudent("Desislava Petrova", 20, false, 4.80);
        newStudent toma = new newStudent("Toma Ivanov", 21, true, 5.2);

        Employee mitko = new Employee("Dimitar Malinov", 45, true, 110);
        Employee viki = new Employee("Viktoriya Boseva", 17, false, 32.5);

        arrPerson[0] = bobi;
        arrPerson[1] = stoyan;
        arrPerson[2] = desi;
        arrPerson[3] = toma;
        arrPerson[4] = mitko;
        arrPerson[5] = viki;

//        for (int i = 0; i < arrPerson.length; i++) {
//            if(arrPerson[i] instanceof Employee) {
//                ((Employee) arrPerson[i]).showEmployeeInfo();
//            } else {
//                if (arrPerson[i] instanceof newStudent) {
//                    ((newStudent) arrPerson[i]).showStudentInfo();
//                } else {
//                    if (arrPerson[i] instanceof Person){
//                        arrPerson[i].showPersonInfo();
//                    }
//                }
//            }
//        }

        for(Object arrayItem : arrPerson){
            if(arrayItem instanceof Employee){
                ((Employee) arrayItem).showEmployeeInfo();
            } else {
                if(arrayItem instanceof newStudent){
                    ((newStudent) arrayItem).showStudentInfo();
                } else {
                    if(arrayItem instanceof Person){
                        ((Person) arrayItem).showPersonInfo();
                    }
                }
            }
        }

        for (int i = 0; i < arrPerson.length; i++) {
            if(arrPerson[i] instanceof Employee){
                ((Employee) arrPerson[i]).calculateOvertime(2);
            }

        }
    }
}


