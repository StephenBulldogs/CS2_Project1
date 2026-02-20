/**
 * Represents a hotel reservation linking a guest to a room.
 * Tracks check-in status and any amenities added during the stay.
 *
 *@author Stephen Schwender
 */
public class Reservation {
    private Guest guest;
    private int nights;
    private Amenity[] amenities;
    private int amenityCount;
    private Room room;
    private boolean checkedIn;

    /**
     * Default constructor.
     */
    public Reservation() {
        guest = new Guest();
        room = new Room();
        nights = 1;
        amenities = new Amenity[100];
        amenityCount = 0;
        checkedIn = false;
    }

    /**
     * Constructor with Arguments for Reservation()
     * Creates a reservation with guest, room, and number of nights.
     *
     * @param guest the guest making the reservation
     * @param room the room being reserved
     * @param nights the number of nights for the stay
     */
    public Reservation(Guest guest, Room room, int nights) {
        this.guest = guest;
        this.room = room;
        this.nights = nights;
        this.amenities = new Amenity[100];
        this.amenityCount = 0;
        checkedIn = false;
    }

    /**
     * Returns the guest for with this reservation.
     *
     * @return the guest
     */
    public Guest getGuest() {
        return guest;
    }

    /**
     * Sets the guest for this reservation.
     *
     * @param guest the guest to set
     */
    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    /**
     * Returns the room for with this reservation.
     *
     * @return the room
     */
    public Room getRoom() {
        return room;
    }

    /**
     * Sets the room for this reservation.
     *
     * @param room the room to set
     */
    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     * Returns the array of amenities added to this reservation.
     *
     * @return the amenities array
     */
    public Amenity[] getAmenities() {
        return amenities;
    }

    /**
     * Sets the amenities array for this reservation.
     *
     * @param amenities the amenities array to set
     */
    public void setAmenities(Amenity[] amenities) {
        this.amenities = amenities;
    }

//    public int getAmenityCount() {
//        return amenityCount;
//    }
//
//    public void setAmenityCount(int amenityCount) {
//        this.amenityCount = amenityCount;
//    }

    /**
     * Returns the number of nights for this reservation.
     *
     * @return the number of nights
     */
    public int getNights() {
        return nights;
    }

    /**
     * Sets the number of nights for this reservation.
     *
     * @param nights the number of nights to set
     */
    public void setNights(int nights) {
        this.nights = nights;
    }

    /**
     * Returns if the guest is currently checked in.
     *
     * @return true if checked in, false otherwise
     */
    public boolean isCheckedIn() {
        return checkedIn;
    }

    /**
     * Sets the check in status of this reservation.
     *
     * @param checkedIn true to mark as checked in, false otherwise
     */
    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    /**
     * Checks the guest in if they are not already checked in.
     */
    public void checkIn() {
        if (!checkedIn) {
            checkedIn = true;
        }
    }

    /**
     * Checks the guest out if they are currently checked in.
     */
    public void checkOut() {
        if (checkedIn) {
            checkedIn = false;
        }
    }

    /**
     * Adds an amenity to the reservation.
     *
     * @param amenity the amenity to add
     */
    public void addAmenity(Amenity amenity) {
        if (checkedIn && amenityCount < amenities.length) {
            amenities[amenityCount] = amenity;
            amenityCount++;
        }
    }

    /**
     * Calculates the total cost of the stay.
     *
     * @return the total amount due
     */
    public double calculateTotal() {
        double total = nights * room.getRoomPricePerNight();
        for (int i = 0; i < amenityCount; i++) {
            total += amenities[i].getCost();
        }
        return total;
    }

    /**
     * Prints an itemized bill for the reservation.
     */
    public void printBill() {
        if (checkedIn) {
            System.out.println("Guest must check out before billing.");
            return;
        }

        System.out.println("Guest: " + guest.getGuestName());
        System.out.println("Room: " + room.toString());
        System.out.println("---------------------------");
        System.out.println("Stay (" + nights + " nights): $" +
                String.format("%.2f", nights * room.getRoomPricePerNight()));

        for (int i = 0; i < amenityCount; i++) {
            System.out.println("Amenity: " + amenities[i].getName() + " ($" +
                    String.format("%.2f", amenities[i].getCost()) + ")");
        }

        System.out.println("---------------------------");
        System.out.println("TOTAL DUE: $" +
                String.format("%.2f", calculateTotal()));
        System.out.println();
    }

    /**
     * Returns a string with the guest and room details for this reservation.
     *
     * @return a string of the reservation
     */
    @Override
    public String toString() {
        return guest.toString() + ", " + room.toString();
    }
}