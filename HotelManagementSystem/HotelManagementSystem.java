package HotelManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelManagementSystem {
    public static int rentRoomPerDay = 750;

    public static class customer {
        String name;
        int roomNo;
        int night;
        int prize;
        int prize_dis;
        int dis = 0;
    }

    public static void addcustomer(ArrayList<customer> customer, Scanner sc) {
        customer c = new customer();
        System.out.println("Enter name");
        c.name = sc.nextLine();
        System.out.println("Enter room no");
        c.roomNo = sc.nextInt();
        System.out.println("no of nights ");
        c.night = sc.nextInt();
        c.dis=(c.night>7)?20:(c.night>5)?10:0;
        c.prize = c.night * rentRoomPerDay;
        c.prize_dis = (int)(c.prize-c.prize * (c.dis / 100.0) );

        customer.add(c);
        sc.nextLine();

    }

    public static void removecustomer(ArrayList<customer> cust, String name, int roomNo) {
        int i;
        for (i = 0; i < cust.size(); i++) {
            if (cust.get(i).name.equals(name) && cust.get(i).roomNo == roomNo) {
                cust.remove(i);
                break;
            }
        }
        if (i == cust.size()) {
            System.out.println("enterd customer didn't have in register");
        } else {
            System.out.println("Customer removed successfully");
        }
    }

    static void displayBill(ArrayList<customer> guest) {
        for (customer customer : guest) {
            System.out.print(customer.name + " :");
            System.out.print(customer.prize + " Rs  ->");
            System.out.print(" Discount " + customer.dis + " %  ->");
            System.out.print(customer.prize_dis + " Rs");
            System.out.println();
        }
    }
    static customer hieghestBill(ArrayList<customer>cus,int n,customer large)
    {
        if(large.prize_dis<cus.get(n).prize_dis){
            large=cus.get(n);

        } 
        if(n==1)
        {
            return large ;
        }
        
        return hieghestBill(cus,n-1,large);
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<customer> cus = new ArrayList<>();
        while (true) {
        System.out.println("Enter your choice");
      System.out.println(" 1- add customer\n 2- remove customer\n 3-bill\n 4-hieghest bill\n 5-display guest");
        String choice = sc.nextLine();
        choice=choice.toLowerCase();
        choice=choice.trim();
        switch (choice) {
            case "add customer":
            case "addcustomer":
            case "1":
                addcustomer(cus, sc);
                break;
            case "remove customer":
            case "removecustomer":
            case "2":
                System.out.println("Enter name");
                String name = sc.nextLine();
                System.out.println("Enter room no");
                int roomNo = sc.nextInt();
                sc.nextLine();
                removecustomer(cus, name, roomNo);
                break;
            case "bill":
            case "3":
                displayBill(cus);break;
            case "4":
            case"hieghest bill": 
            case"hieghestbill":
                customer large=cus.get(0);
                customer hieghest=hieghestBill(cus,cus.size()-1,large);
                System.out.print(hieghest.name+" paid the most : "+hieghest.prize_dis+"\n");
                break;  
                case "5":
                case"display guest":
                case "displayguest":
                    for (customer customer : cus) {
                        System.out.println(customer.name);
                        System.out.println(customer.roomNo);
                        System.out.println(customer.night);
                        System.out.println(customer.prize);
                        System.out.println("-----------------------------");
                    }break;

            default:
                break;
        }
    }

    }

}