import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone Phone = new MobilePhone();
    public static void main(String[] args) {
        boolean quit = false;
        MobilePhone Phone = new MobilePhone();
        System.out.println("What would you like to do:");
        printMenu();
        while(!quit) {
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    quit = true;
                    System.out.println("Thank you!");
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    showContacts();
                    break;
                default:
                    printMenu();
            }
        }
    }

    public static void printMenu(){
        System.out.println("Press 0: Quit");
        System.out.println("Press 1: Add a new contact");
        System.out.println("Press 2: Update a contact");
        System.out.println("Press 3: Remove a contact ");
        System.out.println("Press 4: Show all the contacts");
        System.out.println("Press 5: Show instructions");

    }

    public static void addContact(){


        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        Contact contact = new Contact(name, number);
        Phone.addContact(contact);
    }

    public static void updateContact(){
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        Phone.updateContact(name, number);
    }

    public static void removeContact(){
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        int length = Phone.getContacts().size();
        int number = 0;
        for (int i = 0; i < length; i++) {
            if (Phone.getContacts().get(i).getName() == name)
                number = Phone.getContacts().get(i).getNumber();
        }
        Contact contact = new Contact(name, number);
        Phone.removeContact(contact);
    }


    public static void showContacts(){
        Phone.showContacts();
    }

}
