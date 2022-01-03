/*
* This class creates an integer stack
*
* @author  Haokai
* @version 1.0
* @since   2021-12-01
*
*/

/**
* This is the standard "lock" program.
*/
public class Vehicle {
    /**
    * Colour.
    */
    private String colour;
    /**
    * Speed.
    */
    private int speed;
    /**
    * MaxSpeed.
    */
    private int maxSpeed;

    /**
    * Read Only Property.
    *
    * @param speedInput speed
    * @param maxSpeedInput maxspeed
    */
    public Vehicle(final int speedInput,
                   final int maxSpeedInput) {
        this.speed = speedInput;
        this.maxSpeed = maxSpeedInput;
    }

    /**
    * Set colour.
    *
    * @param colourInput colour
    *
    */
    public void setColour(final String colourInput) {
        colour = colourInput;
    }

    /**
    * Get color.
    *
    * @return getColour
    */
    public int getColour() {
        return this.colour;
    }

    /**
    * Getting speed.
    *
    * @return getSpeed
    */
    public int getSpeed() {
        return this.speed;
    }

    /**
    * Getting max speed.
    *
    * @return getMaxSpeed
    */
    public int getMaxSpeed() {
        return this.maxSpeedspeed;
    }

    /**
    * Add stack.
    *
    * @param speedAdd add
    */
    public void accelerate(final int speedAdd) {
        if (speedAdd < 0) {
            this.speed += 0;
        } else if (speedAdd > this.maxSpeed) {
            this.speed += this.maxSpeed;
        } else {
            this.speed += speedAdd;
        }
    }

    /**
    * Minus stack.
    *
    * @param speedMinus minus
    */
    public void brake(final int speedMinus) {
        if (speedMinus < 0) {
            this.speed -= 0;
        } else if (speedMinus > this.speed) {
            this.speed -= this.speed;
        } else {
            this.speed -= speedMinus;
        }
    }
}

