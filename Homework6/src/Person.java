

public class Person {
    String name;
    int age;
    Boolean isMan;

    Person(String name, int age, boolean isMan){
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    void showPersonInfo(){
        System.out.println(name + " is " + age + " years old ." + "Is man - " + isMan);
    }
}
