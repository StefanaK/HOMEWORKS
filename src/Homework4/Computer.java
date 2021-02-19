package Homework4;

public class Computer {
    String model;
    int year;
    double price;
    boolean isNoteBook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;

    void changeOperationSystem(String newOperationSystem){

        operationSystem = newOperationSystem;
        System.out.println(this.model + " new operation system is " + newOperationSystem);
    }

    void useMemory(double memory){
        if(memory>freeMemory){
            System.out.println("Not enough free memory!");
        } else {
            freeMemory = freeMemory - memory;
        }
    }

    Computer() {
        this.isNoteBook = false;
        this.operationSystem = "Win XP";
    }

    public String toString(){
        return this.model +  "'s operation system is " + this.operationSystem + " and the computer is Notebook " + this.isNoteBook;
    }

    Computer(String model, int year, double price, double hardDiskMemory, double freeMemory){
        this();
        this.model = model;
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }

    Computer(String model, int year, double price, boolean isNoteBook, double hardDiskMemory, double freeMemory, String operationSystem){
        this(model, year, price, hardDiskMemory, freeMemory);
        this.isNoteBook = isNoteBook;
        this.operationSystem = operationSystem;
    }

    int comparePrice(Computer otherComp) {
        if (this.price > otherComp.price) {
            return -1;
        }
            if (this.price < otherComp.price) {
                return 1;
            } else {
                return 0;
            }
        }

    void TimeToInstallNewOs(boolean newIsNoteBook) {
        //newIsNoteBook = this.isNoteBook;
        if (newIsNoteBook) {
            if (this.freeMemory >= 2000) {
                System.out.println(this.model + " is FAST");
            } else {
                if (this.freeMemory > 1000 && this.freeMemory < 2000) {
                    System.out.println(this.model + " is AVERAGE");
                } else {
                    System.out.println(this.model + " is SLOW");
                }
            }
        } else {
            if (!newIsNoteBook && this.freeMemory > 1500) {
                System.out.println(this.model + " is FAST");
            } else {
                System.out.println(this.model + " is SLOW");
            }
        }
    }


    Boolean isMoreExpensive(Computer computerToCompare){
        if(this.price> computerToCompare.price){
            return true;
        } else {
            return false;
        }
    }
}
