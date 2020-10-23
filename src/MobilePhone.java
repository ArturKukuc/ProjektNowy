import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void showContacts(){
        for(int i=0; i < contacts.size(); i++){
            System.out.println(i+1 + ". " + contacts.get(i).getName() + " : " + contacts.get(i).getNumber());
        }
    }

    public void addContact(Contact newContact){
        if(findContact(newContact.getName()))
            System.out.println("Contact" + newContact.getName() + "already exists");
        else {
            contacts.add(newContact);
            System.out.println("Contact " + newContact.getName() + " added");
        }
    }

    private boolean findContact(String name) {

        boolean found = false;
        for(int i=0; i < contacts.size(); i++){
            if(contacts.get(i).getName() == name){
                found = true;
            }
        }
        return found;
    }

    public void updateContact(String name, int number){
        if(!findContact(name))
            System.out.println("Contact" + name + "does not exist");
        else {
            for (int i = 0; i < contacts.size(); i++) {
                if (contacts.get(i).getName() == name)
                    contacts.get(i).setNumber(number);
            }
            System.out.println("Contact " + name + " updated");
        }
    }

    public void removeContact(Contact removedContact){
        if(!findContact(removedContact.getName()))
            System.out.println("Contact" + removedContact.getName() + "does not exist");
        else {
            contacts.remove(removedContact);
            System.out.println("Contact " + removedContact.getName() + " removed");
        }
    }
}
