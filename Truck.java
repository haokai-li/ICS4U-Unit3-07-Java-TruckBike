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
    public Truck() {
        super()
    }

    /**
    * Set license number.
    *
    * @param licenseNumberInput number
    *
    */
    public void setLicense(final String licenseNumberInput) {
        licenseNumber = licenseNumberInput;
    }

    /**
    * Getting License.
    *
    * @return getLicense
    */
    public void getLicense() {
        return this.licenseNumber;
    } 

    /**
    * Add stack.
    *
    * @param speedAdd add
    */
    public void provideAir(final int provideAirInput) {
        super.accelerate(provideAirInput * 2);
    }
}

