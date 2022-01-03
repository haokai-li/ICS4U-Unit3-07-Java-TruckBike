/*
* This program uses the HaokaiStack class
*
* @author  Haokai
* @version 1.0
* @since   2021-12-01
*
*/

import java.util.Scanner;

/**
* This is the standard "lock" program.
*/
final class Main {
    /**
    * The zero.
    */
    private static final int ZERO = 0;
    /**
    * The two.
    */
    private static final int TWO = 2;
    /**
    * The four.
    */
    private static final int FOUR = 4;
    /**
    * The two hundred.
    */
    private static final int TWOOO = 200;
    /**
    * The five hundred.
    */
    private static final int FIVEOO = 500;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        Truck aStack1 = new Truck(TWOOO, TWOOO);
        Scanner userInput1 = new Scanner(System.in);

        System.out.print(
            "Please enter the License plate number of the truck: "
        );
        String licensePlateNumber = userInput1.nextLine();
        aStack1.setLicense(licensePlateNumber);

        System.out.print(
            "Please enter the Colour of the truck: "
        );
        String color = userInput1.nextLine();
        aStack1.setColour(color);

        System.out.println("\n"
                           + "license Plate Number: " + aStack1.getLicense()
                           + "\n"
                           + "Colour: " + aStack1.getColour()
                           + "\n"
                           + "Speed: " + aStack1.getSpeed()
                           + "\n"
                           + "Max Speed: " + aStack1.getMaxSpeed()
                           + "\n");

        System.out.print(
            "Please enter the Provide Air of the truck: "
        );
        final int provideAirNumber = userInput1.nextInt();
        aStack1.provideAir(provideAirNumber);
        System.out.println("Speed:" + aStack1.getSpeed() + "\n");
    }
}
