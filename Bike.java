/*
* This class creates an integer stack
*
* @author  Haokai
* @version 1.0
* @since   2021-12-20
*
*/

/**
* This is the standard "Bike" program.
*/
public class Bike {
    /**
    * Cadence.
    */
    private int cadence;

    /**
    * Getting cadence.
    *
    * @return getCadence
    */
    public int getCadence() {
        return this.cadence;
    }

    /**
    * Setting Cadence.
    *
    * @param setCadence set
    */
    public void setCadence(final int cadenceAdd) {
        this.cadence = cadenceAdd;
    }

    /**
    * Ring Bell.
    *
    * @param ringBell set
    */
    public void ringBell(final String ringBellAdd) {
        if ("y".equals(ringBellAdd)) {
            System.out.println("Bicycle bell on.");
        } else {
            System.out.println("Bicycle bell off.");
        }
    }
}

