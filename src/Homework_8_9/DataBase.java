package Homework_8_9;

public class DataBase {
    private IUser[] users;

    public DataBase (int numberOfUsers){

        users = new AbstractUser[numberOfUsers];
    }

    public IUser[] getUsers() {
        return this.users;
    }
}
