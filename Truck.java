/*
* This class creates an integer stack
*
* @author  Haokai
* @version 1.0
* @since   2021-12-16
*
*/

/**
* This is the standard "Truck" program.
*/
public class Truck extends Vehicle {

    /**
    * License Number.
    */
    private String licenseNumber;

    /**
    * Read Only Property.
    */
    public Truck(int a, int b) {
        super(a, b);
    }

    /**
    * Set license number.
    *
    * @param licenseNumberInput number
    *
    */
    public void setLicense(final String licenseNumberInput) {
        this.licenseNumber = licenseNumberInput;
    }

    /**
    * Getting License.
    *
    * @return getLicense
    */
    public String getLicense() {
        return this.licenseNumber;
    } 

    /**
    * Add stack.
    *
    * @param speedAdd add
    */
    public void provideAir(final int provideAirInput) {
        super.brake(provideAirInput * 2);
    }
}

