/*
* This program is a Bike class.
*
* @author  Malcolm Tompkins
* @version 1.0
* @since   2021-12-28
*/

/**
 * Bike.
 */
public class Bike extends Vehicle {
    /**
    * Constant.
    */
    private static final int FOUR = 4;

    /**
    * Cadense variable.
    */
    private int cadence;

    /**
    * Number of tires variable.
    */
    private int numberOfTires = FOUR;

    /**
    * Constructor.
    *
    * @param initialColour colour
    * @param topSpeed speed
    */
    public Bike(final String initialColour, final int topSpeed) {
        this.cadence = 0;
        super.colour = initialColour;
        super.maxSpeed = topSpeed;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public int getCadence() {
        return this.cadence;
    }

    /**
    * Setter.
    *
    * @param newCadence good
    */
    public void setCadence(final int newCadence) {
        this.cadence = newCadence;
        super.setSpeed(cadence);
        if (super.getSpeed() > super.getMaxSpeed()) {
            super.setSpeed(super.getMaxSpeed());
        }
    }

    /**
    * Print all.
    */
    public void status() {
        super.status();
        System.out.println("Cadence: " + this.cadence);
    }

    /**
    * Ring bell.
    */
    public void ringBell() {
        System.out.println("\nDing, ding.\n");
    }

    /**
    * Method for number of tires.
    *
    * @return numberOfTires number of tires
    */
    public int getNumberOfTires() {
        return this.numberOfTires;
    }
}
