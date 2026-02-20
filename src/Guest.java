/**
 * Represents a hotel guest identified by their name.
 *
 *@author Stephen Schwender
 */
public class Guest {
    private String guestName;

    /**
     * Default constructor for Guest().
     */
    public Guest() {
        guestName = "John Doe";
    }

    /**
     * Constructor with Arguments for Guest()
     * Creates a guest with the name.
     *
     * @param guestName the name of the guest
     */
    public Guest(String guestName) {
        this.guestName = guestName;
    }

    /**
     * Returns the guest's name.
     *
     * @return the guest name
     */
    public String getGuestName() {
        return guestName;
    }

    /**
     * Sets the guest's name.
     *
     * @param guestName the name to set
     */
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    /**
     * Returns a string with the guest's name.
     *
     * @return a string representation of the guest
     */
    @Override
    public String toString() {
        return "Guest:" + guestName;
    }
}