public class ComputerDemo {

    public static void main(String[] args) {
        Computer Dell = new Computer("Dell", 2015, 1500, 516, 2200);


        Computer HP = new Computer("HP", 2010, 800, true, 126, 1100, "Linux");

        Computer Lenovo = new Computer();
        Lenovo.model = "Lenovo";
        Lenovo.price = 1100;
        Lenovo.freeMemory = 150;

        System.out.println(Lenovo.toString());
        System.out.println(Dell.toString());
        System.out.println(HP.toString());

        String newOperationSystemIsChange = "Windows";
        double usedmemory = 100;

        HP.changeOperationSystem(newOperationSystemIsChange);
        Dell.useMemory(usedmemory);
        System.out.println(Dell.model + " 's free memory is " + Dell.freeMemory);

        System.out.println(Dell.comparePrice(HP));
        System.out.println("The price of Dell is higher then HP!");

        System.out.println(HP.comparePrice(Lenovo));
        System.out.println("The price of HP is lower then Lenovo!");

        System.out.println(Lenovo.comparePrice(Dell));
        System.out.println("The price of Lenovo is lower then Dell!");


        Dell.TimeToInstallNewOs(Dell.isNoteBook);
        HP.TimeToInstallNewOs(HP.isNoteBook);
        Lenovo.TimeToInstallNewOs(Lenovo.isNoteBook);

        System.out.println();

        System.out.println(Dell.model + " is more expensive than " + HP.model + " - " + Dell.isMoreExpensive(HP));
        System.out.println(HP.model + " is more expensive than " + Lenovo.model + " - " +  HP.isMoreExpensive(Lenovo));
        System.out.println(Lenovo.model + " is more expensive than " + Dell.model + " - " + Lenovo.isMoreExpensive(Dell));

    }
}
