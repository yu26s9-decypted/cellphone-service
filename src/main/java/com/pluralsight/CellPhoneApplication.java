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



        System.out.printf("\n  Cell Serial Number: %d", newCellSerial);
        System.out.printf("\n  Cell Model: %s", newCellModel);
        System.out.printf("\n  Cell Carrier: %s", newCellCarrier);
        System.out.printf("\n  Cell Phone Number: %s", newCellPhoneNumber);
        System.out.printf("\n  Cell Owner: %s", newCellOwner);
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
}


