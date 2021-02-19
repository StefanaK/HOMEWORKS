package Homework_8_9;

import java.util.Date;

public abstract class AbstractUser implements IUser {

    String name;
    int age;
    String nationality;
    String countryOfResidence;
    String cityOfResidence;

    public void systemLogIn(){
        System.out.println("Status: logged in system!");
    }

    public void systemLogOut(){
        System.out.println("Status: logged out of the system!");
    }

    @Override
    public String username(String nickname) {
        System.out.println("The username is: " + nickname);
        return nickname;
    }

    public String registrationDate() {
        Date date = new Date();
        System.out.println(date);
        return registrationDate();
    }
}
