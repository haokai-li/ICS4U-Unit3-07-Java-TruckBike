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
        final Truck aStack1 = new Truck(ZERO, TWOOO);
        final Scanner userInput1 = new Scanner(System.in);

        System.out.print(
            "Please enter the License plate number of first car: "
        );
        final String licensePlateNumber = userInput1.nextLine();
        System.out.print(
            "Please enter the Colour of first car: "
        );
        final String color = userInput1.nextLine();
        aStack1.push(color);
        aStack1.license(licensePlateNumber);
        aStack1.showLicense();
        aStack1.showStack();

        System.out.print(
            "Please enter the Accelerate of first car: "
        );
        final int accelerateNumber = userInput1.nextInt();
        aStack1.accelerate(accelerateNumber);
        aStack1.showStack();

        System.out.print(
            "Please enter the Brake of first car: "
        );
        final int brakeNumber = userInput1.nextInt();
        aStack1.brake(brakeNumber);
        aStack1.showStack();

        System.out.print(
            "Please enter the provide air of first car: "
        );
        final int air = userInput1.nextInt();
        aStack1.provideair(air);
    }
}
