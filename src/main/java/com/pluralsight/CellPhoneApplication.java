package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static Scanner scanner = new Scanner(System.in);

    static void main() {
        CellPhone i = new CellPhone(
                2424242,
                "iPhone 16",
                "Verizon",
                "123-456-7890",
                "Aaron"
        );

        CellPhone c = new CellPhone();
        int cellSerial = askInt("What is your cell serial number?");
        String cellModel = askString("What is your cell model?");
//        c.setModel(askString("What is your cell model?"));
        String cellCarrier = askString("What is your cell carrier");
        String cellPhoneNumber = askString("What is your cell phone number?");
        String cellOwner = askString("Who's the owner of this cell?");

        CellPhone newRegistration = new CellPhone(
                cellSerial,
                cellModel,
                cellCarrier,
                cellPhoneNumber,
                cellOwner
        );

        int newCellSerial = newRegistration.getCellSerial();
        String newCellModel = newRegistration.getModel();
        String newCellCarrier = newRegistration.getCarrier();
        String newCellPhoneNumber = newRegistration.getPhoneNumber();
        String newCellOwner = newRegistration.getOwner();
        CellPhone otherCellPhone = new CellPhone("Matt", "828-832-2314");
        displayCellPhone(newRegistration);
        displayCellPhone(otherCellPhone);

        System.out.println(newRegistration.dial(otherCellPhone.getPhoneNumber()));
        System.out.println(otherCellPhone.dial(newRegistration.getPhoneNumber()));



    }




    public static int askInt(String prompt){
        System.out.println(prompt);
        int v = scanner.nextInt();
        scanner.nextLine();
        return v;
    }

    public static String askString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();

    }

    public static void displayCellPhone(CellPhone cellPhone){
        System.out.printf("\n  Cell Serial Number: %d", cellPhone.getCellSerial());
        System.out.printf("\n  Cell Model: %s", cellPhone.getModel());
        System.out.printf("\n  Cell Carrier: %s", cellPhone.getCarrier());
        System.out.printf("\n  Cell Phone Number: %s", cellPhone.getPhoneNumber());
        System.out.printf("\n  Cell Owner: %s", cellPhone.getOwner() + "\n");
    }
}


