package PhoneContact;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneContact {
    public static class InnerPhoneContact {
        String name, phoneNo;
    }

    static void addContact(Scanner sc, ArrayList<InnerPhoneContact> cont) {
        InnerPhoneContact c = new InnerPhoneContact();
        System.out.println("enter conact name :");
        c.name = sc.nextLine();
        System.out.println("Enter phone number :");
        c.phoneNo = sc.nextLine();
        c.phoneNo=c.phoneNo.trim();
        cont.add(c);
    }

    static void removetOrsearchContact(Scanner sc, ArrayList<InnerPhoneContact> cont, boolean foremove) {
        System.out.println("Enter name/number :");
        String nameOrNO = sc.nextLine();
        boolean isIn = false;
        for (InnerPhoneContact contact : cont) {
            if (contact.name.toLowerCase().equals(nameOrNO.toLowerCase()) || contact.phoneNo.toLowerCase().equals(nameOrNO.toLowerCase())) {
                isIn = true;
                if (foremove) {
                    System.out.println(contact.name + " is rermoved");
                    cont.remove(contact);
                } else {
                    System.out.println("Found!");
                    System.out.println(contact.name + " : " + contact.phoneNo);
                }
                break;
            }

        }
        if (!isIn) {
            System.out.println(nameOrNO + " is not in contact");
        }
    }

    static void displayContact(ArrayList<InnerPhoneContact> cont) {
        for (InnerPhoneContact contact : cont) {
            System.out.print(contact.name + " :");
            System.out.print(contact.phoneNo);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<InnerPhoneContact> contacts = new ArrayList<>();
        String choice;
        while (true) {
        System.out.println("Enter ur Choice :");
        System.out.println("1-Add Contact\n" +
                "2 - Remove Contact\n" +
                " 3 - Display All\n" +
                " 4 - Search by Name\n" +
                " 5 - Search by Number\n" +
                " 6 - Exit");
        choice = sc.nextLine();
        choice=choice.trim();
        choice=choice.toLowerCase();
        switch (choice) {
            case "add contact" :
                case"addcontact":
                case "1":
                    addContact(sc, contacts);
                break;
            case "2"   :
                case "removecontact" :
                    case"remove contact":
                    removetOrsearchContact(sc, contacts, true);
                    break;
            case "3":
                case"display all":   
                case"displayall":
                displayContact(contacts);break;
            case "4":
                case "search by name":
                    case"search byname":
                    case "searchby name":
                        case"searchbyname":
                        removetOrsearchContact(sc, contacts, false);break;

            case "5":
                case "search by number":
                    case"search bynumber":
                    case "searchby number":
                        case"searchbynumber":
                        case"searchbyno":
                        case"searchby no":
                        case"search byno":
                        case"search by no":
                        removetOrsearchContact(sc, contacts, false);break;
            case "6":
                case"exit":
                System.out.println("Good bye..............");
                   return;            

            default:
                System.out.println("Enterd invalid choice ,plz check choice list.....");
                break;
        }
    }

    }

   
}
